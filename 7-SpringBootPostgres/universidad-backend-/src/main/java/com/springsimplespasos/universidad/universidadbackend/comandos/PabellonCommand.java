package com.springsimplespasos.universidad.universidadbackend.comandos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Pabellon;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
@Order(3)
public class PabellonCommand implements CommandLineRunner {

    @Autowired
    private PabellonDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------- ************ Pabellones Command ************ ---------");

        System.out.println("----- Buscar Pabellon por Localidad");

        Iterable<Pabellon> cPaellon = servicio.buscarPabellonesPorLocalidad(ObjetosDummy.getPabellonUno().getDireccion().getLocalidad());

        if(!((List<Pabellon>)cPaellon).isEmpty()) {
            cPaellon.forEach(System.out::println);
        }

        System.out.println("----- Buscar Pabellon por Nombre");

        Optional<Pabellon> oPabellon = servicio.findPabellonByNombreIgnoreCase(ObjetosDummy.getPabellonDos().getNombre());

        if(oPabellon.isPresent()){
            System.out.println(oPabellon.get().toString());
        }

        System.out.println("----- Buscar Pabellon entre fechas");

        Iterable<Pabellon> iPabellon = servicio.findPabellonsByFechaAltaBetween(LocalDateTime.now().minusHours(2L), LocalDateTime.now());

        iPabellon.forEach(System.out::println);


    }
}

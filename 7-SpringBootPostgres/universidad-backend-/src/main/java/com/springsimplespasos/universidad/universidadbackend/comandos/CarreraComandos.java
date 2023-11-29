package com.springsimplespasos.universidad.universidadbackend.comandos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(7)
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------- ************ Carreras Command ************ ---------");

        System.out.println("--------- Buscar carrera por Cantidad de años");

        Iterable<Carrera> iCarreras = servicio.findCarrerasByCantidadAniosAfter(ObjetosDummy.getCarreraIngSis().getCantidadAnios());

        iCarreras.forEach(System.out::println);

        System.out.println("--------- Buscar carreras por nombre");

        Iterable<Carrera> iCarrerasByNombre = servicio.findCarrerasByNombreContains("Turismo");

        iCarreras.forEach(System.out::println);

        System.out.println("--------- Buscar carreras por nombre ignorecase");

        Iterable<Carrera> iCarrerasByNomIC = servicio.findCarrerasByNombreContainsIgnoreCase("SisTemAS");

        iCarrerasByNomIC.forEach(System.out::println);
        /*Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60, 5);
        Carrera ingIndustrial = new Carrera(null, "Ingenieria Industrial", 55, 5);
        Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos", 53, 5);
        Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica", 45, 5);
        Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas", 40, 4);
        Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo", 42, 4);
        Carrera licYoga = new Carrera(null, "Licenciatura en Yoga", 25, 3);
        Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos - RRHH", 33, 3);

        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licSistemas);
        servicio.save(licTurismo);
        servicio.save(licYoga);
        servicio.save(licRecursos);*/

        /*List<Carrera> carreras = (List<Carrera>)servicio.findCarrerasByNombreContains("Sistemas");
        carreras.forEach(System.out::println);

        List<Carrera> carrerasIgnoreCase1 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("sistemas");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);*/

        /*List<Carrera> carrerasPorAnio = (List<Carrera>) servicio.findCarrerasByCantidadAniosAfter(3);
        carrerasPorAnio.forEach(System.out::println);*/


    }

}

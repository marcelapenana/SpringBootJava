package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Pabellon;
import com.springsimplespasos.universidad.universidadbackend.repositorios.PabellonRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PabellonDAOImple extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {

    @Autowired
    public PabellonDAOImple(PabellonRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly =true)
    public Iterable<Pabellon> buscarPabellonesPorLocalidad(String localidad) {
        return repository.findPabellonsByDireccion_Localidad(localidad);
    }

    @Override
    public Optional<Pabellon> findPabellonByNombreIgnoreCase(String nombre) {
        return repository.findPabellonByNombreIgnoreCase(nombre);
    }

    @Override
    public Iterable<Pabellon> findPabellonsByFechaAltaBetween(LocalDateTime desde, LocalDateTime hasta) {
        return repository.findPabellonsByFechaAltaBetween(desde, hasta);
    }

}

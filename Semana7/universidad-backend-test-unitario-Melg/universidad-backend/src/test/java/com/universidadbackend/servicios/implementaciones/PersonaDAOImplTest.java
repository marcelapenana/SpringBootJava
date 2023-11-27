package com.universidadbackend.servicios.implementaciones;

import com.universidadbackend.repositorios.AlumnoRepository;
import com.universidadbackend.servicios.contratos.PersonaDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonaDAOImplTest {

    PersonaDAO personaDAO;
    @Mock
    AlumnoRepository alumnoRepository;

    @BeforeEach
    void setUp() {
        personaDAO = new PersonaDAOImpl(alumnoRepository);
    }

    @Test
    void buscarPorNombreYApellido() {
        //When
        personaDAO.buscarPorNombreYApellido(anyString(), anyString());

        //Then
        verify(alumnoRepository).buscarPorNombreYApellido(anyString(), anyString());
    }

    @Test
    void buscarPorDni() {
        //When
        personaDAO.buscarPorDni(anyString());

        //Then
        verify(alumnoRepository).buscarPorDni(anyString());
    }

    @Test
    void buscarPersonaPorApellido() {
        //When
        personaDAO.buscarPersonaPorApellido(anyString());

        //Then
        verify(alumnoRepository).buscarPersonaPorApellido(anyString());
    }

}
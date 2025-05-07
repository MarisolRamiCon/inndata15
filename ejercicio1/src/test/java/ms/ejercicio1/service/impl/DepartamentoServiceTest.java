package ms.ejercicio1.service.impl;

import lombok.extern.slf4j.Slf4j;
import ms.ejercicio1.entity.Departamento;
import ms.ejercicio1.repository.DepartamentoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@Slf4j
class DepartamentoServiceTest {
    @InjectMocks //Crea objetos falsos
    DepartamentoService departamentoService;
    @Mock
    DepartamentoRepository departamentoRepository;
    @BeforeEach
    void setUp() {
        log.info("Metodo setUp");
    }

    @AfterEach
    void tearDown() {
        log.info("Método tearDown");
    }

    @Test
    void sumar() {
        Integer res= departamentoService.sumar(10,22);
        Assertions.assertEquals(32,res);
        log.info("Sumando");
    }

    @Test
    void readById() {
        Departamento departamento= new Departamento(1,500L,2500.0,true);
        Mockito.when(departamentoRepository.findById(1)).thenReturn(Optional.of(departamento));
        Optional<Departamento> departamentoEsperado = departamentoService.readById(1);
        Assertions.assertEquals(departamento,departamentoEsperado.get());
    }

    @Test
    void readByIdElse() {
        Departamento departamento= new Departamento(1,508L,2600.0,true);
        Mockito.when(departamentoRepository.findById(2)).thenReturn(null);
        Optional<Departamento> departamentoEsperado= departamentoService.readById(2);
        Assertions.assertEquals(null,departamentoEsperado);
    }
}
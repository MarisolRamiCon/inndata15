package ms.ejercicio1.controller;

import ms.ejercicio1.entity.Persona;
import ms.ejercicio1.model.PersonaResponse;
import ms.ejercicio1.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/personas")
    public List<PersonaResponse> readAll(){
        return personaService.readAll();
    }
}

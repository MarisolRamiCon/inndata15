package ms.ejercicio1.service.impl;

import ms.ejercicio1.entity.Persona;
import ms.ejercicio1.model.PersonaResponse;
import ms.ejercicio1.repository.PersonaRepository;
import ms.ejercicio1.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<PersonaResponse> readAll() {
        List<Persona> listaPersonas= personaRepository.findAll();
        List<PersonaResponse> listaResultante= new ArrayList<>();
        listaResultante=listaPersonas.stream().map(persona -> {
            PersonaResponse personaResponse=
                    new PersonaResponse(persona.getNombre(), persona.getEdad(), persona.getId());
            return personaResponse;
        }).toList();
        return listaResultante;

    }
}

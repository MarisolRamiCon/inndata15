package ms.ejercicio1.service;

import ms.ejercicio1.entity.Persona;
import ms.ejercicio1.model.PersonaResponse;

import java.util.List;

public interface IPersonaService {
    public List<PersonaResponse> readAll();
}

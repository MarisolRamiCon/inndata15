package ms.ejercicio1.service;



import ms.ejercicio1.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    //Métodos READ
    public List<Departamento> readAll();
    public Optional<Departamento> readById(Integer id);
}

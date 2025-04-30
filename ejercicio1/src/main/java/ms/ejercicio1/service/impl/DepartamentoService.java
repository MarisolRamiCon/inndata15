package ms.ejercicio1.service.impl;

import ms.ejercicio1.entity.Departamento;
import ms.ejercicio1.repository.DepartamentoRepository;
import ms.ejercicio1.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {
    //Inyeccion de dependencia
    @Autowired
    DepartamentoRepository departamentoRepository;
    public List<Departamento> readAll(){
        return departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> readById(Integer id) {
        Optional<Departamento> departamento= departamentoRepository.findById(id);
        return departamento;
    }

    @Override
    public Integer create(Departamento departamento) {
        departamentoRepository.save(departamento);
        return departamento.getId();
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String deleteById(Integer id){
        Optional<Departamento> departamentoABorrar= departamentoRepository.findById(id);
        if(departamentoABorrar.isPresent()){
            departamentoRepository.deleteById(id);
            return "Borrado correctamente";
        }else{
            return "El id no existe. Error.";
        }

    }
}

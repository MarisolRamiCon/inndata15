package ms.ejercicio1.service.impl;

import lombok.extern.slf4j.Slf4j;
import ms.ejercicio1.entity.Departamento;
import ms.ejercicio1.repository.DepartamentoRepository;
import ms.ejercicio1.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j //Manda mensajes a la consola que muestra como se esta ejecutando el programa
@Service
public class DepartamentoService implements IDepartamentoService {
    //Inyeccion de dependencia
    @Autowired
    DepartamentoRepository departamentoRepository;
    public List<Departamento> readAll(){
        return departamentoRepository.findAll().stream().filter(departamento ->
                departamento.getActivo()==true).toList();
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
            Departamento dep=departamentoABorrar.get();
            dep.setActivo(false);
            departamentoRepository.save(dep);
            return "Borrado correctamente";
        }else{
            return "El id no existe. Error.";
        }
    }

    @Override
    public List<Departamento> findByPrecioAndM2(Double precio, Long m2) {
        return departamentoRepository.findByPrecioGreaterThanEqualAndM2GreaterThanEqual(precio,m2);
    }

    @Override
    public List<Departamento> findByMenorPrecioM2(Double precio, Long m2) {
        return departamentoRepository.menorPrecioAndm2(precio,m2);
    }

    public Integer sumar(Integer x, Integer y){
        return x+y;
    }
}

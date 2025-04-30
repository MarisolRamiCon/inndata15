package ms.ejercicio1.controller;

import ms.ejercicio1.entity.Departamento;
import ms.ejercicio1.service.impl.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class DepartamentoController {
    //Inyección de dependencia
    @Autowired
    DepartamentoService departamentoService;
    @GetMapping("/departamentos")
    public List<Departamento> readAll(){
        return departamentoService.readAll();
    }
    @GetMapping("/departamentos/{id}")
    public Optional<Departamento> readById(@PathVariable Integer id){
        return departamentoService.readById(id);
    }
    //Create se utiliza el anotation post
    @PostMapping("/departamentos")
    public Integer create(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }
    //update se utiliza el anotation put
    @PutMapping("/departamentos")
    public Departamento update(@RequestBody Departamento departamento){
        return departamentoService.update(departamento);
    }
    @DeleteMapping("/departamentos/{id}")
    public String deleteById(@PathVariable Integer id){
        return departamentoService.deleteById(id);
    }
}

package ms.ejercicio1.service;



import ms.ejercicio1.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    //Métodos READ
    public List<Departamento> readAll();
    public Optional<Departamento> readById(Integer id);
    //Metodos CRUD - Create, Read, Update, Delete
    //Metodo Crear y actualizar
    public Integer create(Departamento departamento);
    public Departamento update(Departamento departamento);
    public String deleteById(Integer id);
    public List<Departamento> findByPrecioAndM2(Double precio, Long m2);
    public List<Departamento> findByMenorPrecioM2(Double precio, Long m2);
}

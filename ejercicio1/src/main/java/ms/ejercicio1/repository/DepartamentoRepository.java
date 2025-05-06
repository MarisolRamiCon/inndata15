package ms.ejercicio1.repository;

import ms.ejercicio1.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
    public List<Departamento> findByPrecioGreaterThanEqualAndM2GreaterThanEqual(Double precio, Long m2);

    @Query(value = "select * from departamento where precio<=:precio and m2<=:m2;", nativeQuery=true)
    public List<Departamento> menorPrecioAndm2( Double precio, Long m2);

}

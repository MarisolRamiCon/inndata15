package ms.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@AllArgsConstructor
@NoArgsConstructor
@Data*/
public class PersonaResponse {
    private String nombre;
    private Integer edad;
    private Integer idDepartamento;

    public PersonaResponse() {
    }

    public PersonaResponse(String nombre, Integer edad, Integer idDepartamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}

package ms.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Viaje {
    private Integer id;
    private String destino;
    private Double precio;
    private LocalDateTime fechaSalida;
}

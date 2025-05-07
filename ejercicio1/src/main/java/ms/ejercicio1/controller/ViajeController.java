package ms.ejercicio1.controller;

import ms.ejercicio1.model.Viaje;
import ms.ejercicio1.service.impl.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class ViajeController {
    @Autowired
    ViajeService viajeService;
    @GetMapping("/viajes")
    public List<Viaje> readAll(){
        return viajeService.readAll();
    }
}

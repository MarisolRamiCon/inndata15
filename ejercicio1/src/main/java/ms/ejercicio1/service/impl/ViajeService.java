package ms.ejercicio1.service.impl;

import ms.ejercicio1.feign.ViajeClient;
import ms.ejercicio1.model.Viaje;
import ms.ejercicio1.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViajeService implements IViajeService {
    @Autowired
    ViajeClient viajeClient;
    @Override
    public List<Viaje> readAll() {
        return viajeClient.getData();
    }
}

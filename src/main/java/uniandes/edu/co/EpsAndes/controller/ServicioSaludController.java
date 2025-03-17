package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.ServicioSalud;
import uniandes.edu.co.EpsAndes.service.ServicioSaludService;

@RestController
@RequestMapping("/api/servicios")
public class ServicioSaludController {

    @Autowired
    private ServicioSaludService servicioSaludService;

    @GetMapping
    public List<ServicioSalud> getAllServicios() {
        return servicioSaludService.getAllServicioSalud();
    }

    @GetMapping("/{codigo}")
    public ServicioSalud getServicio(@PathVariable String codigo) {
        return servicioSaludService.getServicioSaludByCodigo(codigo);
    }

    @PostMapping
    public ServicioSalud createServicio(@RequestBody ServicioSalud servicioSalud) {
        return servicioSaludService.createServicioSalud(servicioSalud);
    }

    @DeleteMapping("/{codigo}")
    public void deleteServicio(@PathVariable String codigo) {
        servicioSaludService.deleteServicioSalud(codigo);
    }
}

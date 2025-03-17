package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.OrdenServicio;
import uniandes.edu.co.EpsAndes.service.OrdenServicioService;

@RestController
@RequestMapping("/api/ordenservicios")
public class OrdenServicioController {

    @Autowired
    private OrdenServicioService ordenServicioService;

    @GetMapping
    public List<OrdenServicio> getAllOrdenServicios() {
        return ordenServicioService.getAllOrdenServicios();
    }

    @GetMapping("/{id}")
    public OrdenServicio getOrdenServicio(@PathVariable String id) {
        return ordenServicioService.getOrdenServicioById(id);
    }

    @PostMapping
    public OrdenServicio createOrdenServicio(@RequestBody OrdenServicio ordenServicio) {
        return ordenServicioService.createOrdenServicio(ordenServicio);
    }

    @DeleteMapping("/{id}")
    public void deleteOrdenServicio(@PathVariable String id) {
        ordenServicioService.deleteOrdenServicio(id);
    }
}

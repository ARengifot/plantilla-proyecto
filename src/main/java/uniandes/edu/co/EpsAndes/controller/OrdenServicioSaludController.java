package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.OrdenServicioSalud;
import uniandes.edu.co.EpsAndes.service.OrdenServicioSaludService;

@RestController
@RequestMapping("/api/ordenserviciosalud")
public class OrdenServicioSaludController {

    @Autowired
    private OrdenServicioSaludService ordenServicioSaludService;

    @GetMapping
    public List<OrdenServicioSalud> getAllOrdenServicioSalud() {
        return ordenServicioSaludService.getAllOrdenServicioSalud();
    }

    @GetMapping("/{ordenId}/{servicioCodigo}")
    public OrdenServicioSalud getOrdenServicioSalud(@PathVariable String ordenId, @PathVariable String servicioCodigo) {
        return ordenServicioSaludService.getOrdenServicioSaludById(ordenId, servicioCodigo);
    }

    @PostMapping
    public OrdenServicioSalud createOrdenServicioSalud(@RequestBody OrdenServicioSalud ordenServicioSalud) {
        return ordenServicioSaludService.createOrdenServicioSalud(ordenServicioSalud);
    }

    @DeleteMapping("/{ordenId}/{servicioCodigo}")
    public void deleteOrdenServicioSalud(@PathVariable String ordenId, @PathVariable String servicioCodigo) {
        ordenServicioSaludService.deleteOrdenServicioSalud(ordenId, servicioCodigo);
    }
}

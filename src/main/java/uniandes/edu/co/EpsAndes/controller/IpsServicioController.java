package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.IpsServicio;
import uniandes.edu.co.EpsAndes.service.IpsServicioService;

@RestController
@RequestMapping("/api/ipsservicios")
public class IpsServicioController {

    @Autowired
    private IpsServicioService ipsServicioService;

    @GetMapping
    public List<IpsServicio> getAllIpsServicios() {
        return ipsServicioService.getAllIpsServicios();
    }

    @GetMapping("/{ipsNit}/{servicioCodigo}")
    public IpsServicio getIpsServicio(@PathVariable String ipsNit, @PathVariable String servicioCodigo) {
        return ipsServicioService.getIpsServicioById(ipsNit, servicioCodigo);
    }

    @PostMapping
    public IpsServicio createIpsServicio(@RequestBody IpsServicio ipsServicio) {
        return ipsServicioService.createIpsServicio(ipsServicio);
    }

    @DeleteMapping("/{ipsNit}/{servicioCodigo}")
    public void deleteIpsServicio(@PathVariable String ipsNit, @PathVariable String servicioCodigo) {
        ipsServicioService.deleteIpsServicio(ipsNit, servicioCodigo);
    }
}

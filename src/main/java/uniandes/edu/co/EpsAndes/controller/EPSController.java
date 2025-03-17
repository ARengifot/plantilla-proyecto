package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.EPS;
import uniandes.edu.co.EpsAndes.service.EPSService;

@RestController
@RequestMapping("/api/eps")
public class EPSController {

    @Autowired
    private EPSService epsService;

    @GetMapping
    public List<EPS> getAllEPS() {
        return epsService.getAllEPS();
    }

    @GetMapping("/{nit}")
    public EPS getEPS(@PathVariable String nit) {
        return epsService.getEPSByNit(nit);
    }

    @PostMapping
    public EPS createEPS(@RequestBody EPS eps) {
        return epsService.createEPS(eps);
    }

    @DeleteMapping("/{nit}")
    public void deleteEPS(@PathVariable String nit) {
        epsService.deleteEPS(nit);
    }
}

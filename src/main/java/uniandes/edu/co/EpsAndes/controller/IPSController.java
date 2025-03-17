package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.IPS;
import uniandes.edu.co.EpsAndes.service.IPSService;

@RestController
@RequestMapping("/api/ips")
public class IPSController {

    @Autowired
    private IPSService ipsService;

    @GetMapping
    public List<IPS> getAllIPS() {
        return ipsService.getAllIPS();
    }

    @GetMapping("/{nit}")
    public IPS getIPS(@PathVariable String nit) {
        return ipsService.getIPSByNit(nit);
    }

    @PostMapping
    public IPS createIPS(@RequestBody IPS ips) {
        return ipsService.createIPS(ips);
    }

    @DeleteMapping("/{nit}")
    public void deleteIPS(@PathVariable String nit) {
        ipsService.deleteIPS(nit);
    }
}

package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.MedicoIps;
import uniandes.edu.co.EpsAndes.service.MedicoIpsService;

@RestController
@RequestMapping("/api/medicoips")
public class MedicoIpsController {

    @Autowired
    private MedicoIpsService medicoIpsService;

    @GetMapping
    public List<MedicoIps> getAllMedicoIps() {
        return medicoIpsService.getAllMedicoIps();
    }

    @GetMapping("/{medicoNumeroDocumento}/{ipsNit}")
    public MedicoIps getMedicoIps(@PathVariable String medicoNumeroDocumento, @PathVariable String ipsNit) {
        return medicoIpsService.getMedicoIpsById(medicoNumeroDocumento, ipsNit);
    }

    @PostMapping
    public MedicoIps createMedicoIps(@RequestBody MedicoIps medicoIps) {
        return medicoIpsService.createMedicoIps(medicoIps);
    }

    @DeleteMapping("/{medicoNumeroDocumento}/{ipsNit}")
    public void deleteMedicoIps(@PathVariable String medicoNumeroDocumento, @PathVariable String ipsNit) {
        medicoIpsService.deleteMedicoIps(medicoNumeroDocumento, ipsNit);
    }
}

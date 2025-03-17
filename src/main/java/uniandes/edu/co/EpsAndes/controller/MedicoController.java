package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.Medico;
import uniandes.edu.co.EpsAndes.service.MedicoService;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GetMapping("/{tipoDocumento}/{numeroDocumento}")
    public Medico getMedico(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento) {
        return medicoService.getMedicoById(tipoDocumento, numeroDocumento);
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoService.createMedico(medico);
    }

    @DeleteMapping("/{tipoDocumento}/{numeroDocumento}")
    public void deleteMedico(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento) {
        medicoService.deleteMedico(tipoDocumento, numeroDocumento);
    }
}

package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.Beneficiario;
import uniandes.edu.co.EpsAndes.service.BeneficiarioService;

@RestController
@RequestMapping("/api/beneficiarios")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioService beneficiarioService;

    @GetMapping
    public List<Beneficiario> getAllBeneficiarios() {
        return beneficiarioService.getAllBeneficiarios();
    }

    @GetMapping("/{numeroDocumento}")
    public Beneficiario getBeneficiario(@PathVariable String numeroDocumento) {
        return beneficiarioService.getBeneficiarioByNumeroDocumento(numeroDocumento);
    }

    @PostMapping
    public Beneficiario createBeneficiario(@RequestBody Beneficiario beneficiario) {
        return beneficiarioService.createBeneficiario(beneficiario);
    }

    @DeleteMapping("/{numeroDocumento}")
    public void deleteBeneficiario(@PathVariable String numeroDocumento) {
        beneficiarioService.deleteBeneficiario(numeroDocumento);
    }
}

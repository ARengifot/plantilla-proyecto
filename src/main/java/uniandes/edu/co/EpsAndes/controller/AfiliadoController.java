package uniandes.edu.co.EpsAndes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.EpsAndes.model.Afiliado;
import uniandes.edu.co.EpsAndes.service.AfiliadoService;

@RestController
@RequestMapping("/api/afiliados")
public class AfiliadoController {

    @Autowired
    private AfiliadoService afiliadoService;

    @GetMapping
    public List<Afiliado> getAllAfiliados() {
        return afiliadoService.getAllAfiliados();
    }

    @GetMapping("/{tipoDocumento}/{numeroDocumento}")
    public Afiliado getAfiliado(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento) {
        return afiliadoService.getAfiliadoById(tipoDocumento, numeroDocumento);
    }

    @PostMapping
    public Afiliado createAfiliado(@RequestBody Afiliado afiliado) {
        return afiliadoService.createAfiliado(afiliado);
    }

    @DeleteMapping("/{tipoDocumento}/{numeroDocumento}")
    public void deleteAfiliado(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento) {
        afiliadoService.deleteAfiliado(tipoDocumento, numeroDocumento);
    }
}

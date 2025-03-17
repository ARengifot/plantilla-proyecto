package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.Afiliado;
import uniandes.edu.co.EpsAndes.model.AfiliadoId;
import uniandes.edu.co.EpsAndes.repository.AfiliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AfiliadoService {

    @Autowired
    private AfiliadoRepository afiliadoRepository;

    public List<Afiliado> getAllAfiliados() {
        return afiliadoRepository.findAll();
    }

    public Afiliado getAfiliadoById(String tipoDocumento, String numeroDocumento) {
        AfiliadoId id = new AfiliadoId(tipoDocumento, numeroDocumento);
        return afiliadoRepository.findById(id).orElse(null);
    }

    public Afiliado createAfiliado(Afiliado afiliado) {
        return afiliadoRepository.save(afiliado);
    }

    public void deleteAfiliado(String tipoDocumento, String numeroDocumento) {
        AfiliadoId id = new AfiliadoId(tipoDocumento, numeroDocumento);
        afiliadoRepository.deleteById(id);
    }
}

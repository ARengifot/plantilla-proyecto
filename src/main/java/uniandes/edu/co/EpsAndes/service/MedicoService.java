package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.Medico;
import uniandes.edu.co.EpsAndes.model.MedicoId;
import uniandes.edu.co.EpsAndes.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    public Medico getMedicoById(String tipoDocumento, String numeroDocumento) {
        MedicoId id = new MedicoId(tipoDocumento, numeroDocumento);
        return medicoRepository.findById(id).orElse(null);
    }

    public Medico createMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public void deleteMedico(String tipoDocumento, String numeroDocumento) {
        MedicoId id = new MedicoId(tipoDocumento, numeroDocumento);
        medicoRepository.deleteById(id);
    }
}

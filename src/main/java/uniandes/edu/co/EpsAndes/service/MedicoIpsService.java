package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.MedicoIps;
import uniandes.edu.co.EpsAndes.model.MedicoIpsId;
import uniandes.edu.co.EpsAndes.repository.MedicoIpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class MedicoIpsService {

    @Autowired
    private MedicoIpsRepository medicoIpsRepository;
    
    public List<MedicoIps> getAllMedicoIps() {
        return medicoIpsRepository.findAll();
    }
    
    public MedicoIps getMedicoIpsById(String medicoNumeroDocumento, String ipsNit) {
        MedicoIpsId id = new MedicoIpsId(medicoNumeroDocumento, ipsNit);
        return medicoIpsRepository.findById(id).orElse(null);
    }
    
    public MedicoIps createMedicoIps(MedicoIps medicoIps) {
        return medicoIpsRepository.save(medicoIps);
    }
    
    public void deleteMedicoIps(String medicoNumeroDocumento, String ipsNit) {
        MedicoIpsId id = new MedicoIpsId(medicoNumeroDocumento, ipsNit);
        medicoIpsRepository.deleteById(id);
    }
}

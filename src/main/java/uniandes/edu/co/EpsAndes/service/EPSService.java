package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.EPS;
import uniandes.edu.co.EpsAndes.repository.EpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class EPSService {

    @Autowired
    private EpsRepository epsRepository;

    public List<EPS> getAllEPS() {
        return epsRepository.findAll();
    }

    public EPS getEPSByNit(String nit) {
        return epsRepository.findById(nit).orElse(null);
    }

    public EPS createEPS(EPS eps) {
        return epsRepository.save(eps);
    }

    public void deleteEPS(String nit) {
        epsRepository.deleteById(nit);
    }
}

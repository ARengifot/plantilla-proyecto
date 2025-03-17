package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.IPS;
import uniandes.edu.co.EpsAndes.repository.IpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class IPSService {

    @Autowired
    private IpsRepository ipsRepository;

    public List<IPS> getAllIPS() {
        return ipsRepository.findAll();
    }

    public IPS getIPSByNit(String nit) {
        return ipsRepository.findById(nit).orElse(null);
    }

    public IPS createIPS(IPS ips) {
        return ipsRepository.save(ips);
    }

    public void deleteIPS(String nit) {
        ipsRepository.deleteById(nit);
    }
}

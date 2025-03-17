package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.IpsServicio;
import uniandes.edu.co.EpsAndes.model.IpsServicioId;
import uniandes.edu.co.EpsAndes.repository.IpsServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class IpsServicioService {

    @Autowired
    private IpsServicioRepository ipsServicioRepository;
    
    public List<IpsServicio> getAllIpsServicios() {
        return ipsServicioRepository.findAll();
    }
    
    public IpsServicio getIpsServicioById(String ipsNit, String servicioCodigo) {
        IpsServicioId id = new IpsServicioId(ipsNit, servicioCodigo);
        return ipsServicioRepository.findById(id).orElse(null);
    }
    
    public IpsServicio createIpsServicio(IpsServicio ipsServicio) {
        return ipsServicioRepository.save(ipsServicio);
    }
    
    public void deleteIpsServicio(String ipsNit, String servicioCodigo) {
        IpsServicioId id = new IpsServicioId(ipsNit, servicioCodigo);
        ipsServicioRepository.deleteById(id);
    }
}

package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.OrdenServicioSalud;
import uniandes.edu.co.EpsAndes.model.OrdenServicioSaludId;
import uniandes.edu.co.EpsAndes.repository.OrdenServicioSaludRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdenServicioSaludService {

    @Autowired
    private OrdenServicioSaludRepository ordenServicioSaludRepository;
    
    public List<OrdenServicioSalud> getAllOrdenServicioSalud() {
        return ordenServicioSaludRepository.findAll();
    }
    
    public OrdenServicioSalud getOrdenServicioSaludById(String ordenId, String servicioCodigo) {
        OrdenServicioSaludId id = new OrdenServicioSaludId(ordenId, servicioCodigo);
        return ordenServicioSaludRepository.findById(id).orElse(null);
    }
    
    public OrdenServicioSalud createOrdenServicioSalud(OrdenServicioSalud ordenServicioSalud) {
        return ordenServicioSaludRepository.save(ordenServicioSalud);
    }
    
    public void deleteOrdenServicioSalud(String ordenId, String servicioCodigo) {
        OrdenServicioSaludId id = new OrdenServicioSaludId(ordenId, servicioCodigo);
        ordenServicioSaludRepository.deleteById(id);
    }
}

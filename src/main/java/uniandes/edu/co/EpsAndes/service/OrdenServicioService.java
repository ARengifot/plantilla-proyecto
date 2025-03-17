package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.OrdenServicio;
import uniandes.edu.co.EpsAndes.repository.OrdenServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdenServicioService {

    @Autowired
    private OrdenServicioRepository ordenServicioRepository;
    
    public List<OrdenServicio> getAllOrdenServicios() {
        return ordenServicioRepository.findAll();
    }
    
    public OrdenServicio getOrdenServicioById(String id) {
        return ordenServicioRepository.findById(id).orElse(null);
    }
    
    public OrdenServicio createOrdenServicio(OrdenServicio ordenServicio) {
        return ordenServicioRepository.save(ordenServicio);
    }
    
    public void deleteOrdenServicio(String id) {
        ordenServicioRepository.deleteById(id);
    }
}

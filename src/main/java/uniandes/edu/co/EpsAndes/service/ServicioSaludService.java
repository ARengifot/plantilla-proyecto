package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.ServicioSalud;
import uniandes.edu.co.EpsAndes.repository.ServicioSaludRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioSaludService {

    @Autowired
    private ServicioSaludRepository servicioSaludRepository;
    
    public List<ServicioSalud> getAllServicioSalud() {
        return servicioSaludRepository.findAll();
    }
    
    public ServicioSalud getServicioSaludByCodigo(String codigo) {
        return servicioSaludRepository.findById(codigo).orElse(null);
    }
    
    public ServicioSalud createServicioSalud(ServicioSalud servicioSalud) {
        return servicioSaludRepository.save(servicioSalud);
    }
    
    public void deleteServicioSalud(String codigo) {
        servicioSaludRepository.deleteById(codigo);
    }
}

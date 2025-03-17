package uniandes.edu.co.EpsAndes.service;

import uniandes.edu.co.EpsAndes.model.Beneficiario;
import uniandes.edu.co.EpsAndes.repository.BeneficiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepository beneficiarioRepository;
    
    public List<Beneficiario> getAllBeneficiarios() {
        return beneficiarioRepository.findAll();
    }
    
    public Beneficiario getBeneficiarioByNumeroDocumento(String numeroDocumento) {
        return beneficiarioRepository.findById(numeroDocumento).orElse(null);
    }
    
    public Beneficiario createBeneficiario(Beneficiario beneficiario) {
        return beneficiarioRepository.save(beneficiario);
    }
    
    public void deleteBeneficiario(String numeroDocumento) {
        beneficiarioRepository.deleteById(numeroDocumento);
    }
}

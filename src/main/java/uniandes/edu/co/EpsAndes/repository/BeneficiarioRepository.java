package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, String> {
}

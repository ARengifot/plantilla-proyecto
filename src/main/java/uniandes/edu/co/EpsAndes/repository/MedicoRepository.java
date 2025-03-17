package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.Medico;
import uniandes.edu.co.EpsAndes.model.MedicoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, MedicoId> {
}

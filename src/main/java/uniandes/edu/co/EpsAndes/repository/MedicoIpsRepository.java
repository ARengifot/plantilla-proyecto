package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.MedicoIps;
import uniandes.edu.co.EpsAndes.model.MedicoIpsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoIpsRepository extends JpaRepository<MedicoIps, MedicoIpsId> {
}

package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.OrdenServicioSalud;
import uniandes.edu.co.EpsAndes.model.OrdenServicioSaludId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenServicioSaludRepository extends JpaRepository<OrdenServicioSalud, OrdenServicioSaludId> {
}

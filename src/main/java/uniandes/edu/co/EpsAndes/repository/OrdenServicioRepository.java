package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.OrdenServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenServicioRepository extends JpaRepository<OrdenServicio, String> {
}

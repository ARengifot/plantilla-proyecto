package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.ServicioSalud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioSaludRepository extends JpaRepository<ServicioSalud, String> {
}

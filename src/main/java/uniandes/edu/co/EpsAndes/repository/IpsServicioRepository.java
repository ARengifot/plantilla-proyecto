package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.IpsServicio;
import uniandes.edu.co.EpsAndes.model.IpsServicioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpsServicioRepository extends JpaRepository<IpsServicio, IpsServicioId> {
}

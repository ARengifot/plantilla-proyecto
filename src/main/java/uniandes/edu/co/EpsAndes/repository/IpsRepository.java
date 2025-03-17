package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.IPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpsRepository extends JpaRepository<IPS, String> {
}

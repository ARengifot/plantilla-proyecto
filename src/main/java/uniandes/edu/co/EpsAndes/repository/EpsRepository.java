package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.EPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsRepository extends JpaRepository<EPS, String> {
    
}

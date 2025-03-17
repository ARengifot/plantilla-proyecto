package uniandes.edu.co.EpsAndes.repository;

import uniandes.edu.co.EpsAndes.model.Afiliado;
import uniandes.edu.co.EpsAndes.model.AfiliadoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliadoRepository extends JpaRepository<Afiliado, AfiliadoId> {
}

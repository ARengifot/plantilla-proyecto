package uniandes.edu.co.EpsAndes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.EpsAndes.model.EPS;
import uniandes.edu.co.EpsAndes.repository.EpsRepository;
@SpringBootConfiguration
@SpringBootTest
@Transactional
public class EPSServiceTest {

    @Autowired
    private EPSService epsService;
    
    @Autowired
    private EpsRepository epsRepository;

    @Test
    public void testCreateAndFindEPS() {
        EPS eps = new EPS();
        eps.setNit("TESTNIT");
        eps.setNombre("Test EPS");

        epsService.createEPS(eps);

        EPS found = epsService.getEPSByNit("TESTNIT");
        assertNotNull(found);
        assertEquals("Test EPS", found.getNombre());
    }

    @Test
    public void testDeleteEPS() {
        EPS eps = new EPS();
        eps.setNit("TESTNIT_DEL");
        eps.setNombre("To Delete");

        epsService.createEPS(eps);
        assertNotNull(epsService.getEPSByNit("TESTNIT_DEL"));

        epsService.deleteEPS("TESTNIT_DEL");
        EPS found = epsService.getEPSByNit("TESTNIT_DEL");
        assertNull(found);
    }
}

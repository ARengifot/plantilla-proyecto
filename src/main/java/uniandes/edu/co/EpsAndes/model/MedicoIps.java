package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "MEDICO_IPS")
public class MedicoIps {

    @EmbeddedId
    private MedicoIpsId id;

    @ManyToOne
    @MapsId("medicoNumeroDocumento")
    @JoinColumn(name = "Medico_numeroDocumento")
    private Medico medico;

    @ManyToOne
    @MapsId("ipsNit")
    @JoinColumn(name = "IPS_NIT")
    private IPS ips;

    public MedicoIps() {}

    // Getters y Setters
    public MedicoIpsId getId() {
        return id;
    }
    public void setId(MedicoIpsId id) {
        this.id = id;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public IPS getIps() {
        return ips;
    }
    public void setIps(IPS ips) {
        this.ips = ips;
    }
}

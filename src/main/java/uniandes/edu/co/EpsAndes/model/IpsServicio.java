package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "IPS_SERVICIO")
public class IpsServicio {

    @EmbeddedId
    private IpsServicioId id;

    @ManyToOne
    @MapsId("ipsNit")
    @JoinColumn(name = "IPS_NIT")
    private IPS ips;

    @ManyToOne
    @MapsId("servicioCodigo")
    @JoinColumn(name = "Servicio_codigo")
    private ServicioSalud servicioSalud;

    public IpsServicio() {}

    // Getters y Setters
    public IpsServicioId getId() {
        return id;
    }
    public void setId(IpsServicioId id) {
        this.id = id;
    }
    public IPS getIps() {
        return ips;
    }
    public void setIps(IPS ips) {
        this.ips = ips;
    }
    public ServicioSalud getServicioSalud() {
        return servicioSalud;
    }
    public void setServicioSalud(ServicioSalud servicioSalud) {
        this.servicioSalud = servicioSalud;
    }
}

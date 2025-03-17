package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "ORDEN_SERVICIO_SALUD")
public class OrdenServicioSalud {

    @EmbeddedId
    private OrdenServicioSaludId id;

    @ManyToOne
    @MapsId("ordenId")
    @JoinColumn(name = "Orden_id")
    private OrdenServicio ordenServicio;

    @ManyToOne
    @MapsId("servicioCodigo")
    @JoinColumn(name = "Servicio_codigo")
    private ServicioSalud servicioSalud;

    public OrdenServicioSalud() {}

    // Getters y Setters
    public OrdenServicioSaludId getId() {
        return id;
    }
    public void setId(OrdenServicioSaludId id) {
        this.id = id;
    }
    public OrdenServicio getOrdenServicio() {
        return ordenServicio;
    }
    public void setOrdenServicio(OrdenServicio ordenServicio) {
        this.ordenServicio = ordenServicio;
    }
    public ServicioSalud getServicioSalud() {
        return servicioSalud;
    }
    public void setServicioSalud(ServicioSalud servicioSalud) {
        this.servicioSalud = servicioSalud;
    }
}

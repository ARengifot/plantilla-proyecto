package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDEN_SERVICIO")
public class OrdenServicio {

    @Id
    @Column(name = "id", length = 20)
    private String id;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "estado", length = 20)
    private String estado;

    @Column(name = "afiliadoDocumento", length = 20)
    private String afiliadoDocumento;

    @Column(name = "medicoDocumento", length = 20)
    private String medicoDocumento;

    public OrdenServicio() {}

    // Getters y Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getAfiliadoDocumento() {
        return afiliadoDocumento;
    }
    public void setAfiliadoDocumento(String afiliadoDocumento) {
        this.afiliadoDocumento = afiliadoDocumento;
    }
    public String getMedicoDocumento() {
        return medicoDocumento;
    }
    public void setMedicoDocumento(String medicoDocumento) {
        this.medicoDocumento = medicoDocumento;
    }
}

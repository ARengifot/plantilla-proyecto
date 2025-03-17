package uniandes.edu.co.EpsAndes.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class OrdenServicioSaludId implements Serializable {
    private String ordenId;
    private String servicioCodigo;

    public OrdenServicioSaludId() {}

    public OrdenServicioSaludId(String ordenId, String servicioCodigo) {
        this.ordenId = ordenId;
        this.servicioCodigo = servicioCodigo;
    }

    // Getters, Setters, equals y hashCode
    public String getOrdenId() {
        return ordenId;
    }
    public void setOrdenId(String ordenId) {
        this.ordenId = ordenId;
    }
    public String getServicioCodigo() {
        return servicioCodigo;
    }
    public void setServicioCodigo(String servicioCodigo) {
        this.servicioCodigo = servicioCodigo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdenServicioSaludId)) return false;
        OrdenServicioSaludId that = (OrdenServicioSaludId) o;
        return Objects.equals(ordenId, that.ordenId) &&
               Objects.equals(servicioCodigo, that.servicioCodigo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ordenId, servicioCodigo);
    }
}

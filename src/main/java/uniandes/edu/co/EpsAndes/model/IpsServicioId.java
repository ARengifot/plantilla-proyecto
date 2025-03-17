package uniandes.edu.co.EpsAndes.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class IpsServicioId implements Serializable {
    
    private String ipsNit;
    private String servicioCodigo;

    public IpsServicioId() {}

    public IpsServicioId(String ipsNit, String servicioCodigo) {
        this.ipsNit = ipsNit;
        this.servicioCodigo = servicioCodigo;
    }

    // Getters y Setters
    public String getIpsNit() {
        return ipsNit;
    }
    public void setIpsNit(String ipsNit) {
        this.ipsNit = ipsNit;
    }
    public String getServicioCodigo() {
        return servicioCodigo;
    }
    public void setServicioCodigo(String servicioCodigo) {
        this.servicioCodigo = servicioCodigo;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IpsServicioId)) return false;
        IpsServicioId that = (IpsServicioId) o;
        return Objects.equals(ipsNit, that.ipsNit) &&
               Objects.equals(servicioCodigo, that.servicioCodigo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipsNit, servicioCodigo);
    }
}

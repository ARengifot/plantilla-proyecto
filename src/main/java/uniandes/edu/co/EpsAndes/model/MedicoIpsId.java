package uniandes.edu.co.EpsAndes.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class MedicoIpsId implements Serializable {

    private String medicoNumeroDocumento;
    private String ipsNit;

    public MedicoIpsId() {}

    public MedicoIpsId(String medicoNumeroDocumento, String ipsNit) {
        this.medicoNumeroDocumento = medicoNumeroDocumento;
        this.ipsNit = ipsNit;
    }

    // Getters, Setters, equals y hashCode
    public String getMedicoNumeroDocumento() {
        return medicoNumeroDocumento;
    }
    public void setMedicoNumeroDocumento(String medicoNumeroDocumento) {
        this.medicoNumeroDocumento = medicoNumeroDocumento;
    }
    public String getIpsNit() {
        return ipsNit;
    }
    public void setIpsNit(String ipsNit) {
        this.ipsNit = ipsNit;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicoIpsId)) return false;
        MedicoIpsId that = (MedicoIpsId) o;
        return Objects.equals(medicoNumeroDocumento, that.medicoNumeroDocumento) &&
               Objects.equals(ipsNit, that.ipsNit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(medicoNumeroDocumento, ipsNit);
    }
}

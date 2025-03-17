package uniandes.edu.co.EpsAndes.model;

import java.io.Serializable;
import java.util.Objects;

public class MedicoId implements Serializable {
    private String tipoDocumento;
    private String numeroDocumento;

    public MedicoId() {}

    public MedicoId(String tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    // Getters, Setters, equals y hashCode
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicoId)) return false;
        MedicoId that = (MedicoId) o;
        return Objects.equals(tipoDocumento, that.tipoDocumento) &&
               Objects.equals(numeroDocumento, that.numeroDocumento);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento, numeroDocumento);
    }
}

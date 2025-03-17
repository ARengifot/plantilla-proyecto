package uniandes.edu.co.EpsAndes.model;

import java.io.Serializable;
import java.util.Objects;

public class AfiliadoId implements Serializable {
    private String tipoDocumento;
    private String numeroDocumento;

    public AfiliadoId() {}

    public AfiliadoId(String tipoDocumento, String numeroDocumento) {
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
        if (!(o instanceof AfiliadoId)) return false;
        AfiliadoId that = (AfiliadoId) o;
        return Objects.equals(tipoDocumento, that.tipoDocumento) &&
               Objects.equals(numeroDocumento, that.numeroDocumento);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento, numeroDocumento);
    }
}

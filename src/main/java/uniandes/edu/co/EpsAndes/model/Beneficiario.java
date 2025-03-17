package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "BENEFICIARIO")
public class Beneficiario {

    @Id
    @Column(name = "numeroDocumento", length = 20)
    private String numeroDocumento;

    @Column(name = "parentesco", length = 50)
    private String parentesco;

    // Relación con Afiliado (asumiendo que numeroDocumento es único en Afiliado gracias a restricción UNIQUE)
    @OneToOne
    @JoinColumn(name = "numeroDocumento", insertable = false, updatable = false)
    private Afiliado afiliado;

    public Beneficiario() {}

    // Getters y Setters
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    public Afiliado getAfiliado() {
        return afiliado;
    }
    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
}

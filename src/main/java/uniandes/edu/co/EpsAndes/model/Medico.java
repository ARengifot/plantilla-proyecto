package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "MEDICO")
@IdClass(MedicoId.class)
public class Medico {

    @Id
    @Column(name = "tipoDocumento", length = 10)
    private String tipoDocumento;

    @Id
    @Column(name = "numeroDocumento", length = 20)
    private String numeroDocumento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "especialidad", length = 50)
    private String especialidad;

    @Column(name = "numeroRegistroMedico", unique = true, length = 20)
    private String numeroRegistroMedico;

    public Medico() {}

    // Getters y Setters
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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getNumeroRegistroMedico() {
        return numeroRegistroMedico;
    }
    public void setNumeroRegistroMedico(String numeroRegistroMedico) {
        this.numeroRegistroMedico = numeroRegistroMedico;
    }
}

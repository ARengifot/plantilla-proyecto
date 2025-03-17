package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "EPS")
public class EPS {

    @Id
    @Column(name = "NIT", length = 20)
    private String nit;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Constructor vacío
    public EPS() {}

    // Getters y Setters
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

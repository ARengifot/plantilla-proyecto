package uniandes.edu.co.EpsAndes.model;

import javax.persistence.*;

@Entity
@Table(name = "IPS")
public class IPS {

    @Id
    @Column(name = "NIT", length = 20)
    private String nit;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "EPS_NIT")
    private EPS eps;

    public IPS() {}

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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public EPS getEps() {
        return eps;
    }
    public void setEps(EPS eps) {
        this.eps = eps;
    }
}

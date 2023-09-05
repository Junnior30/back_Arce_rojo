package arce.rojo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Proyecto")
public class Proyecto implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idP")
    private int idP;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "inversion")
    private double inversion;

    @Column(name = "costo")
    private double costo;

    @JsonIgnore
    @OneToMany(mappedBy ="proyecto")
    private Set<Inscripcion> inscripcion ;

    @Override
    public String toString() {
        return "Proyecto [costo=" + costo + ", descripcion=" + descripcion + ", estado=" + estado + ", idP=" + idP
                + ", inscripcion=" + inscripcion + ", inversion=" + inversion + ", nombre=" + nombre + "]";
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Set<Inscripcion> getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Set<Inscripcion> inscripcion) {
        this.inscripcion = inscripcion;
    }

    


}

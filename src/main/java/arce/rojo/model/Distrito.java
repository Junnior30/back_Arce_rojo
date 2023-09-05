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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Distrito")

public class Distrito implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idD")
    private int idD;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "longitud")
    private Double longitud;
    
    @JsonIgnore
    @OneToMany
    @JoinColumn(name="codigo_distrito")
    private Set<Alumno> alumnos;

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    
}
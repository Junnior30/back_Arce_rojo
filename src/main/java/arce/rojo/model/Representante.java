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
@Table(name = "Representante")
public class Representante implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idR")
    private int idR;

    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo")
    private String correo;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name="codigo_representante")
    private Set<Alumno> alumnos;

    public int getIdR() {
      return idR;
    }

    public void setIdR(int idR) {
      this.idR = idR;
    }

    public String getNombres() {
      return nombres;
    }

    public void setNombres(String nombres) {
      this.nombres = nombres;
    }

    public String getApellidos() {
      return apellidos;
    }

    public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
    }

    public String getIdentificacion() {
      return identificacion;
    }

    public void setIdentificacion(String identificacion) {
      this.identificacion = identificacion;
    }

    public String getTelefono() {
      return telefono;
    }

    public void setTelefono(String telefono) {
      this.telefono = telefono;
    }

    public String getDireccion() {
      return direccion;
    }

    public void setDireccion(String direccion) {
      this.direccion = direccion;
    }

    public String getCorreo() {
      return correo;
    }

    public void setCorreo(String correo) {
      this.correo = correo;
    }

    public Set<Alumno> getAlumnos() {
      return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
      this.alumnos = alumnos;
    }

    
}
package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEMP")
    private int idEMP;
    
    @Column(name = "nombre")
    private  String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;

    @Column(name = "codigo_cargo")
    private int codigo_cargo;

    @ManyToOne()
    @JoinColumn(name = "codigo_cargo", insertable = false, updatable = false)
    private Cargo_Emp cargo;

    @Override
    public String toString() {
      return "Empleado [idEMP=" + idEMP + ", nombre=" + nombre + ", apellido=" + apellido + ", identificacion="
          + identificacion + ", telefono=" + telefono + ", correo=" + correo + ", codigo_cargo=" + codigo_cargo
          + ", cargo=" + cargo + "]";
    }

    public int getIdEMP() {
      return idEMP;
    }

    public void setIdEMP(int idEMP) {
      this.idEMP = idEMP;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getApellido() {
      return apellido;
    }

    public void setApellido(String apellido) {
      this.apellido = apellido;
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

    public String getCorreo() {
      return correo;
    }

    public void setCorreo(String correo) {
      this.correo = correo;
    }

    public int getCodigo_cargo() {
      return codigo_cargo;
    }

    public void setCodigo_cargo(int codigo_cargo) {
      this.codigo_cargo = codigo_cargo;
    }

    public Cargo_Emp getCargo() {
      return cargo;
    }

    public void setCargo(Cargo_Emp cargo) {
      this.cargo = cargo;
    }
   
    
    
}


package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCLI")
    private int idCLI;
    
    @Column(name = "nombre")
    private  String nombre;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Override
    public String toString() {
      return "Cliente [correo=" + correo + ", idCLI=" + idCLI + ", identificacion=" + identificacion + ", nombre="
          + nombre + ", telefono=" + telefono + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdCLI() {
      return idCLI;
    }

    public void setIdCLI(int idCLI) {
      this.idCLI = idCLI;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getIdentificacion() {
      return identificacion;
    }

    public void setIdentificacion(String identificacion) {
      this.identificacion = identificacion;
    }

    public String getCorreo() {
      return correo;
    }

    public void setCorreo(String correo) {
      this.correo = correo;
    }

    public String getTelefono() {
      return telefono;
    }

    public void setTelefono(String telefono) {
      this.telefono = telefono;
    }

    
}

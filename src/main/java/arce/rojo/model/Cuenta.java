package arce.rojo.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Cuenta")
public class Cuenta implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCUENTA")
    private int idCUENTA;
    
    @Column(name = "nombre")
    private  String nombre;

    @Column(name = "numero_cuenta")
    private long numero_cuenta;

    @Column(name = "descripcion")
    private String descripcion;

    @Override
    public String toString() {
      return "Cuenta [descripcion=" + descripcion + ", idCUENTA=" + idCUENTA + ", nombre=" + nombre + ", numero_cuenta="
          + numero_cuenta + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdCUENTA() {
      return idCUENTA;
    }

    public void setIdCUENTA(int idCUENTA) {
      this.idCUENTA = idCUENTA;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public long getNumero_cuenta() {
      return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
      this.numero_cuenta = numero_cuenta;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    
}

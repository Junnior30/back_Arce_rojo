package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Curso")
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCU")
    private int idCU;
    
    @Column(name = "nombre")
    private  String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Override
    public String toString() {
      return "Curso [descripcion=" + descripcion + ", idCU=" + idCU + ", nombre=" + nombre + "]";
    }

    public int getIdCU() {
      return idCU;
    }

    public void setIdCU(int idCU) {
      this.idCU = idCU;
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

    
}

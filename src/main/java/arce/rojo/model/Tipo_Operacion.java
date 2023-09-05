package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Tipo_Operacion")
public class Tipo_Operacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTO")
    private int idTO;

    @Column(name = "nombre")
    private String nombre;

    @Override
    public String toString() {
      return "Tipo_Operacion [idTO=" + idTO + ", nombre=" + nombre + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdTO() {
      return idTO;
    }

    public void setIdTO(int idTO) {
      this.idTO = idTO;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    
}

package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Forma_Operacion")
public class Forma_Operacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFO")
    private int idFO;
    
    @Column(name = "nombre")
    private String nombre;

    @Override
    public String toString() {
      return "Forma_Operacion [idFO=" + idFO + ", nombre=" + nombre + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdFO() {
      return idFO;
    }

    public void setIdFO(int idFO) {
      this.idFO = idFO;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

}

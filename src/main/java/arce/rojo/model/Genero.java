package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Genero")
public class Genero implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGE")
    private int idGE;
    
    @Column(name = "nombre")
    private String nombre;

    @Override
    public String toString() {
      return "Genero [idGE=" + idGE + ", nombre=" + nombre + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdGE() {
      return idGE;
    }

    public void setIdGE(int idGE) {
      this.idGE = idGE;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

}

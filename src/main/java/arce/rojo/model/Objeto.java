package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Objeto")
public class Objeto implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOB")
    private int idOB;
    
    @Column(name = "objeto")
    private String objeto;

    @Column(name = "precio")
    private double precio;

    @Override
    public String toString() {
      return "Objeto [idOB=" + idOB + ", objeto=" + objeto + ", precio=" + precio + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdOB() {
      return idOB;
    }

    public void setIdOB(int idOB) {
      this.idOB = idOB;
    }

    public String getObjeto() {
      return objeto;
    }

    public void setObjeto(String objeto) {
      this.objeto = objeto;
    }

    public double getPrecio() {
      return precio;
    }

    public void setPrecio(double precio) {
      this.precio = precio;
    }

    
}


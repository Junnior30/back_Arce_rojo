package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Factura")
public class Factura implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFA")
    private int idFA;
    
    @Column(name = "codigo_compra")
    private int codigo_compra;

    @Override
    public String toString() {
      return "Factura [codigo_compra=" + codigo_compra + ", idFA=" + idFA + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdFA() {
      return idFA;
    }

    public void setIdFA(int idFA) {
      this.idFA = idFA;
    }

    public int getCodigo_compra() {
      return codigo_compra;
    }

    public void setCodigo_compra(int codigo_compra) {
      this.codigo_compra = codigo_compra;
    }

    
}


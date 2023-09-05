package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Detalle_Compra")
public class Detalle_Compra implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDC")
    private int idDC;
    
    @Column(name = "monto")
    private  double monto;

    @Column(name = "codigo_operacion")
    private int codigo_operacion;

    @Column(name = "codigo_compra")
    private int codigo_compra;

    @Override
    public String toString() {
      return "Detalle_Compra [codigo_compra=" + codigo_compra + ", codigo_operacion=" + codigo_operacion + ", idDC="
          + idDC + ", monto=" + monto + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdDC() {
      return idDC;
    }

    public void setIdDC(int idDC) {
      this.idDC = idDC;
    }

    public double getMonto() {
      return monto;
    }

    public void setMonto(double monto) {
      this.monto = monto;
    }

    public int getCodigo_operacion() {
      return codigo_operacion;
    }

    public void setCodigo_operacion(int codigo_operacion) {
      this.codigo_operacion = codigo_operacion;
    }

    public int getCodigo_compra() {
      return codigo_compra;
    }

    public void setCodigo_compra(int codigo_compra) {
      this.codigo_compra = codigo_compra;
    }

    
}
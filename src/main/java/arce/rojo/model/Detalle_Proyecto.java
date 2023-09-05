package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Detalle_Proyecto")
public class Detalle_Proyecto implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDP")
    private int idDP;
    
    @Column(name = "monto")
    private  double monto;

    @Column(name = "codigo_operacion")
    private int codigo_operacion;

    @Column(name = "codigo_proyecto")
    private int codigo_proyecto;

    @Override
    public String toString() {
      return "Detalle_Proyecto [codigo_operacion=" + codigo_operacion + ", codigo_proyecto=" + codigo_proyecto
          + ", idDP=" + idDP + ", monto=" + monto + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdDP() {
      return idDP;
    }

    public void setIdDP(int idDP) {
      this.idDP = idDP;
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

    public int getCodigo_proyecto() {
      return codigo_proyecto;
    }

    public void setCodigo_proyecto(int codigo_proyecto) {
      this.codigo_proyecto = codigo_proyecto;
    }

    
}


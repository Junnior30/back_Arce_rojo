package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Detalle_Evento")
public class Detalle_Evento implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDE")
    private int idDE;
    
    @Column(name = "monto")
    private  double monto;

    @Column(name = "codigo_operacion")
    private int codigo_operacion;

    @Column(name = "codigo_evento")
    private int codigo_evento;

    @Override
    public String toString() {
      return "Detalle_Evento [codigo_evento=" + codigo_evento + ", codigo_operacion=" + codigo_operacion + ", idDE="
          + idDE + ", monto=" + monto + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdDE() {
      return idDE;
    }

    public void setIdDE(int idDE) {
      this.idDE = idDE;
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

    public int getCodigo_evento() {
      return codigo_evento;
    }

    public void setCodigo_evento(int codigo_evento) {
      this.codigo_evento = codigo_evento;
    }

}

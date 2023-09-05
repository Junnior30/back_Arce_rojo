package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Detalle_Ministerio")
public class Detalle_Ministerio implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDM")
    private int idDM;
    
    @Column(name = "importe")
    private  double importe;

    @Column(name = "codigo_operacion")
    private int codigo_operacion;

    @Column(name = "codigo_ministerio")
    private int codigo_ministerio;

    @Override
    public String toString() {
      return "Detalle_Ministerio [codigo_ministerio=" + codigo_ministerio + ", codigo_operacion=" + codigo_operacion
          + ", idDM=" + idDM + ", importe=" + importe + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdDM() {
      return idDM;
    }

    public void setIdDM(int idDM) {
      this.idDM = idDM;
    }

    public double getImporte() {
      return importe;
    }

    public void setImporte(double importe) {
      this.importe = importe;
    }

    public int getCodigo_operacion() {
      return codigo_operacion;
    }

    public void setCodigo_operacion(int codigo_operacion) {
      this.codigo_operacion = codigo_operacion;
    }

    public int getCodigo_ministerio() {
      return codigo_ministerio;
    }

    public void setCodigo_ministerio(int codigo_ministerio) {
      this.codigo_ministerio = codigo_ministerio;
    }

}


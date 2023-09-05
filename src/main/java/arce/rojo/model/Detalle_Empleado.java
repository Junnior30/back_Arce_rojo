package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Detalle_Empleado")
public class Detalle_Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDEM")
    private int idDEM;
    
    @Column(name = "importe")
    private  double importe;

    @Column(name = "codigo_empleado")
    private int codigo_empleado;

    @Column(name = "codigo_operacion")
    private int codigo_operacion;

    @Override
    public String toString() {
      return "Detalle_Empleado [codigo_empleado=" + codigo_empleado + ", codigo_operacion=" + codigo_operacion
          + ", idDEM=" + idDEM + ", importe=" + importe + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdDEM() {
      return idDEM;
    }

    public void setIdDEM(int idDEM) {
      this.idDEM = idDEM;
    }

    public double getImporte() {
      return importe;
    }

    public void setImporte(double importe) {
      this.importe = importe;
    }

    public int getCodigo_empleado() {
      return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
      this.codigo_empleado = codigo_empleado;
    }

    public int getCodigo_operacion() {
      return codigo_operacion;
    }

    public void setCodigo_operacion(int codigo_operacion) {
      this.codigo_operacion = codigo_operacion;
    }
    
    
}

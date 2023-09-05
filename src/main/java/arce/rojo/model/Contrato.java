package arce.rojo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Contrato")
public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCO")
    private int idCO;
    
    @Column(name = "detalle")
    private  String detalle;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "codigo_empleado")
    private int codigo_empleado;

    @Override
    public String toString() {
      return "Contrato [codigo_empleado=" + codigo_empleado + ", detalle=" + detalle + ", fecha=" + fecha + ", idCO="
          + idCO + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdCO() {
      return idCO;
    }

    public void setIdCO(int idCO) {
      this.idCO = idCO;
    }

    public String getDetalle() {
      return detalle;
    }

    public void setDetalle(String detalle) {
      this.detalle = detalle;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public int getCodigo_empleado() {
      return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
      this.codigo_empleado = codigo_empleado;
    }

    
}
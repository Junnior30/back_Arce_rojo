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
@Table(name = "Operacion")
public class Operacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOP")
    private int idOP;
    
    @Column(name = "numero_operacion")
    private long numero_operacion;

    @Column(name = "comprobante")
    private byte comprobante;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "codigo_tipo_operacion")
    private int codigo_tipo_operacion;

    @Column(name = "codigo_cuenta")
    private int codigo_cuenta;

    @Column(name = "codigo_forma_operacion")
    private int codigo_forma_operacion;

    @Override
    public String toString() {
      return "Operacion [codigo_cuenta=" + codigo_cuenta + ", codigo_forma_operacion=" + codigo_forma_operacion
          + ", codigo_tipo_operacion=" + codigo_tipo_operacion + ", comprobante=" + comprobante + ", detalle=" + detalle
          + ", fecha=" + fecha + ", idOP=" + idOP + ", numero_operacion=" + numero_operacion + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdOP() {
      return idOP;
    }

    public void setIdOP(int idOP) {
      this.idOP = idOP;
    }

    public long getNumero_operacion() {
      return numero_operacion;
    }

    public void setNumero_operacion(long numero_operacion) {
      this.numero_operacion = numero_operacion;
    }

    public byte getComprobante() {
      return comprobante;
    }

    public void setComprobante(byte comprobante) {
      this.comprobante = comprobante;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public String getDetalle() {
      return detalle;
    }

    public void setDetalle(String detalle) {
      this.detalle = detalle;
    }

    public int getCodigo_tipo_operacion() {
      return codigo_tipo_operacion;
    }

    public void setCodigo_tipo_operacion(int codigo_tipo_operacion) {
      this.codigo_tipo_operacion = codigo_tipo_operacion;
    }

    public int getCodigo_cuenta() {
      return codigo_cuenta;
    }

    public void setCodigo_cuenta(int codigo_cuenta) {
      this.codigo_cuenta = codigo_cuenta;
    }

    public int getCodigo_forma_operacion() {
      return codigo_forma_operacion;
    }

    public void setCodigo_forma_operacion(int codigo_forma_operacion) {
      this.codigo_forma_operacion = codigo_forma_operacion;
    }

    
}


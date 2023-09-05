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
@Table(name = "Ministerio")
public class Ministerio implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMIN")
    private int idMIN;
    
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "monto")
    private double monto;

    @Column(name = "recibo")
    private byte recibo;

    @Column(name = "descripcion")
    private String descripcion;

    @Override
    public String toString() {
        return "Ministerio [descripcion=" + descripcion + ", fecha=" + fecha + ", idMIN=" + idMIN + ", monto=" + monto
                + ", recibo=" + recibo + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdMIN() {
      return idMIN;
    }

    public void setIdMIN(int idMIN) {
      this.idMIN = idMIN;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public double getMonto() {
      return monto;
    }

    public void setMonto(double monto) {
      this.monto = monto;
    }

    public byte getRecibo() {
      return recibo;
    }

    public void setRecibo(byte recibo) {
      this.recibo = recibo;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    
}

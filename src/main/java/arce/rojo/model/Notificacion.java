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
@Table(name = "Notificacion")
public class Notificacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idN")
    private int idN;
    
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "codigo_clase")
    private int codigo_clase;

    @Override
    public String toString() {
      return "Notificacion [codigo_clase=" + codigo_clase + ", detalle=" + detalle + ", fecha=" + fecha + ", idN=" + idN
          + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdN() {
      return idN;
    }

    public void setIdN(int idN) {
      this.idN = idN;
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

    public int getCodigo_clase() {
      return codigo_clase;
    }

    public void setCodigo_clase(int codigo_clase) {
      this.codigo_clase = codigo_clase;
    }

}

    


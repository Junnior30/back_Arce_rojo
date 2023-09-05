package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Recomendacion")
public class Recomendacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRE")
    private int idRE;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "codigo_empleado")
    private int codigo_empleado;

    @Override
    public String toString() {
      return "Recomendacion [codigo_empleado=" + codigo_empleado + ", detalle=" + detalle + ", idRE=" + idRE + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdRE() {
      return idRE;
    }

    public void setIdRE(int idRE) {
      this.idRE = idRE;
    }

    public String getDetalle() {
      return detalle;
    }

    public void setDetalle(String detalle) {
      this.detalle = detalle;
    }

    public int getCodigo_empleado() {
      return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
      this.codigo_empleado = codigo_empleado;
    }

    
}


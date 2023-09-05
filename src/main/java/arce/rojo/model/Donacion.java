package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Donacion")
public class Donacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDO")
    private int idDO;
    
    @Column(name = "importe")
    private  double importe;

    @Column(name = "codigo_operacion")
    private int codigo_operacion;

    @Column(name = "codigo_cliente")
    private int codigo_cliente;

    @Override
    public String toString() {
      return "Donacion [codigo_cliente=" + codigo_cliente + ", codigo_operacion=" + codigo_operacion + ", idDO=" + idDO
          + ", importe=" + importe + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdDO() {
      return idDO;
    }

    public void setIdDO(int idDO) {
      this.idDO = idDO;
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

    public int getCodigo_cliente() {
      return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
      this.codigo_cliente = codigo_cliente;
    }

    
}

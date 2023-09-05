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
@Table(name = "Compra")
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCOMPRA")
    private int idCOMPRA;
    
    @Column(name = "tipo_compra")
    private  String tipo_compra;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "codigo_objeto")
    private int codigo_objeto;

    @Override
    public String toString() {
      return "Compra [codigo_objeto=" + codigo_objeto + ", descripcion=" + descripcion + ", fecha=" + fecha
          + ", idCOMPRA=" + idCOMPRA + ", tipo_compra=" + tipo_compra + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdCOMPRA() {
      return idCOMPRA;
    }

    public void setIdCOMPRA(int idCOMPRA) {
      this.idCOMPRA = idCOMPRA;
    }

    public String getTipo_compra() {
      return tipo_compra;
    }

    public void setTipo_compra(String tipo_compra) {
      this.tipo_compra = tipo_compra;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public int getCodigo_objeto() {
      return codigo_objeto;
    }

    public void setCodigo_objeto(int codigo_objeto) {
      this.codigo_objeto = codigo_objeto;
    }

    
}

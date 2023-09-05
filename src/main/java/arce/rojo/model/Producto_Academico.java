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
@Table(name = "Producto_Academico")
public class Producto_Academico implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPA")
    private int idPA;

    @Column(name = "fecha")
    private Date fecha; 

    @Column(name = "peso")
    private float peso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "codigo_clase")
    private int codigo_clase;

    @Override
    public String toString() {
      return "Producto_Academico [codigo_clase=" + codigo_clase + ", descripcion=" + descripcion + ", fecha=" + fecha
          + ", idPA=" + idPA + ", peso=" + peso + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdPA() {
      return idPA;
    }

    public void setIdPA(int idPA) {
      this.idPA = idPA;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public float getPeso() {
      return peso;
    }

    public void setPeso(float peso) {
      this.peso = peso;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public int getCodigo_clase() {
      return codigo_clase;
    }

    public void setCodigo_clase(int codigo_clase) {
      this.codigo_clase = codigo_clase;
    }

    
    
}




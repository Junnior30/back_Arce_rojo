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
@Table(name = "Calificacion")
public class Calificacion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCAL")
    private int idCAL;

    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "nota")
    private  float nota;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "codigo_producto_academico")
    private int codigo_producto_academico;

    @Override
    public String toString() {
      return "Calificacion [codigo_producto_academico=" + codigo_producto_academico + ", descripcion=" + descripcion
          + ", fecha=" + fecha + ", idCAL=" + idCAL + ", nota=" + nota + "]";
    }

    public int getIdCAL() {
      return idCAL;
    }

    public void setIdCAL(int idCAL) {
      this.idCAL = idCAL;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public float getNota() {
      return nota;
    }

    public void setNota(float nota) {
      this.nota = nota;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public int getCodigo_producto_academico() {
      return codigo_producto_academico;
    }

    public void setCodigo_producto_academico(int codigo_producto_academico) {
      this.codigo_producto_academico = codigo_producto_academico;
    }

    
}


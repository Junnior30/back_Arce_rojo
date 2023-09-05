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
@Table(name = "Cuota")
public class Cuota implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idC")
    private int idC;
    
    @Column(name = "descripcion")
    private  String descripcion;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "monto")
    private double monto;

    @Column(name = "codigo_proyecto")
    private int codigo_proyecto;

    @Column(name = "codigo_evento")
    private int codigo_evento;

    @Column(name = "codigo_alumno")
    private int codigo_alumno;

    @Override
    public String toString() {
      return "Cuota [codigo_alumno=" + codigo_alumno + ", codigo_evento=" + codigo_evento + ", codigo_proyecto="
          + codigo_proyecto + ", descripcion=" + descripcion + ", estado=" + estado + ", fecha=" + fecha + ", idC="
          + idC + ", monto=" + monto + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdC() {
      return idC;
    }

    public void setIdC(int idC) {
      this.idC = idC;
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

    public boolean isEstado() {
      return estado;
    }

    public void setEstado(boolean estado) {
      this.estado = estado;
    }

    public double getMonto() {
      return monto;
    }

    public void setMonto(double monto) {
      this.monto = monto;
    }

    public int getCodigo_proyecto() {
      return codigo_proyecto;
    }

    public void setCodigo_proyecto(int codigo_proyecto) {
      this.codigo_proyecto = codigo_proyecto;
    }

    public int getCodigo_evento() {
      return codigo_evento;
    }

    public void setCodigo_evento(int codigo_evento) {
      this.codigo_evento = codigo_evento;
    }

    public int getCodigo_alumno() {
      return codigo_alumno;
    }

    public void setCodigo_alumno(int codigo_alumno) {
      this.codigo_alumno = codigo_alumno;
    }

    
}
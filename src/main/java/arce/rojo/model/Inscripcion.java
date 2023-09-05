package arce.rojo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
@Table(name = "Inscripcion")
public class Inscripcion implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idI")
    private int idI;

    @Column(name = "Estado")
    private boolean Estado = true;

    @Column(name = "Costo")
    private double Costo;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @PrePersist
    public void PrePersist(){
      fecha = new Date();
    }

    @Column(name = "codigo_alumno")
    private int codigo_alumno;

    @ManyToOne
    @JoinColumn(name="codigo_alumno",insertable = false, updatable = false)
    private Alumno alumno;

    @Column(name="codigo_proyecto")
    private int codigo_proyecto;

    @ManyToOne
    @JoinColumn(name = "codigo_proyecto",insertable = false, updatable = false)
    private Proyecto proyecto;

    public int getIdI() {
      return idI;
    }

    public void setIdI(int idI) {
      this.idI = idI;
    }

    public boolean isEstado() {
      return Estado;
    }

    public void setEstado(boolean estado) {
      Estado = estado;
    }

    public double getCosto() {
      return Costo;
    }

    public void setCosto(double costo) {
      Costo = costo;
    }

    public int getCodigo_alumno() {
      return codigo_alumno;
    }

    public void setCodigo_alumno(int codigo_alumno) {
      this.codigo_alumno = codigo_alumno;
    }

    public Date getFecha() {
      return fecha;
    }

    public void setFecha(Date fecha) {
      this.fecha = fecha;
    }

    public Alumno getAlumno() {
      return alumno;
    }

    public void setAlumno(Alumno alumno) {
      this.alumno = alumno;
    }

    public int getCodigo_proyecto() {
      return codigo_proyecto;
    }

    public void setCodigo_proyecto(int codigo_proyecto) {
      this.codigo_proyecto = codigo_proyecto;
    }

    public Proyecto getProyecto() {
      return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
      this.proyecto = proyecto;
    }
}

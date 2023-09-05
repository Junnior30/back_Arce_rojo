package arce.rojo.model;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Clase")
public class Clase implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCLAS")
    private int idCLAS;
    
    @Column(name = "fecha_inicio")
    private  Date fecha_inicio;

    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @Column(name = "estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="codigo_docente",insertable = false, updatable = false)
    private Empleado empleado;

    @Column(name = "codigo_docente")
    private int codigo_docente;

    @ManyToOne
    @JoinColumn(name="codigo_curso",insertable = false, updatable = false)
    private Curso curso;

    @Column(name = "codigo_curso")
    private int codigo_curso;

    @ManyToOne
    @JoinColumn(name="codigo_proyecto",insertable = false, updatable = false)
    private Proyecto proyecto;

    @Column(name = "codigo_proyecto")
    private int codigo_proyecto;

    @Override
    public String toString() {
      return "Clase [idCLAS=" + idCLAS + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", estado="
          + estado + ", empleado=" + empleado + ", codigo_docente=" + codigo_docente + ", curso=" + curso
          + ", codigo_curso=" + codigo_curso + ", proyecto=" + proyecto + ", codigo_proyecto=" + codigo_proyecto + "]";
    }

    public int getIdCLAS() {
      return idCLAS;
    }

    public void setIdCLAS(int idCLAS) {
      this.idCLAS = idCLAS;
    }

    public Date getFecha_inicio() {
      return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
      this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
      return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
      this.fecha_fin = fecha_fin;
    }

    public boolean isEstado() {
      return estado;
    }

    public void setEstado(boolean estado) {
      this.estado = estado;
    }

    public Empleado getEmpleado() {
      return empleado;
    }

    public void setEmpleado(Empleado empleado) {
      this.empleado = empleado;
    }

    public int getCodigo_docente() {
      return codigo_docente;
    }

    public void setCodigo_docente(int codigo_docente) {
      this.codigo_docente = codigo_docente;
    }

    public Curso getCurso() {
      return curso;
    }

    public void setCurso(Curso curso) {
      this.curso = curso;
    }

    public int getCodigo_curso() {
      return codigo_curso;
    }

    public void setCodigo_curso(int codigo_curso) {
      this.codigo_curso = codigo_curso;
    }

    public Proyecto getProyecto() {
      return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
      this.proyecto = proyecto;
    }

    public int getCodigo_proyecto() {
      return codigo_proyecto;
    }

    public void setCodigo_proyecto(int codigo_proyecto) {
      this.codigo_proyecto = codigo_proyecto;
    }

  
}

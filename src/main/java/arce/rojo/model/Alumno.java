package arce.rojo.model;

import java.io.Serializable;
import java.util.Date;
//import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

@Entity
@Table(name = "Alumno")
public class Alumno implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idA")
  private int idA;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "apellidoPat")
  private String apellidoPat;

  @Column(name = "apellidoMat")
  private String apellidoMat;

  @Column(name = "fechaN")
  @Temporal(TemporalType.DATE)
  private Date fechaN;

  @Column(name = "genero")
  private boolean genero;

  @Column(name = "identificacion")
  private String identificacion;

  @Column(name = "colegio")
  private String colegio;

  @Column(name="codigo_distrito")
  private int codigo_distrito;

  @ManyToOne()
  @JoinColumn(name = "codigo_distrito", insertable = false, updatable = false)
  private Distrito distrito;

  @Column(name="codigo_representante")
  private int codigo_representante;

  @ManyToOne
  @JoinColumn(name = "codigo_representante", insertable = false, updatable = false)
  private Representante representante ;
  /* 
  @JsonIgnore
  @OneToMany(mappedBy = "alumno",cascade = CascadeType.ALL)
  private Set<Inscripcion> inscripcion;
  */
  public int getIdA() {
    return idA;
  }

  public void setIdA(int idA) {
    this.idA = idA;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPat() {
    return apellidoPat;
  }

  public void setApellidoPat(String apellidoPat) {
    this.apellidoPat = apellidoPat;
  }

  public String getApellidoMat() {
    return apellidoMat;
  }

  public void setApellidoMat(String apellidoMat) {
    this.apellidoMat = apellidoMat;
  }

  public Date getFechaN() {
    return fechaN;
  }

  public void setFechaN(Date fechaN) {
    this.fechaN = fechaN;
  }

  public boolean isGenero() {
    return genero;
  }

  public void setGenero(boolean genero) {
    this.genero = genero;
  }

  public String getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  public String getColegio() {
    return colegio;
  }

  public void setColegio(String colegio) {
    this.colegio = colegio;
  }

  public int getCodigo_distrito() {
    return codigo_distrito;
  }

  public void setCodigo_distrito(int codigo_distrito) {
    this.codigo_distrito = codigo_distrito;
  }

  public Distrito getDistrito() {
    return distrito;
  }

  public void setDistrito(Distrito distrito) {
    this.distrito = distrito;
  }

  public int getCodigo_representante() {
    return codigo_representante;
  }

  public void setCodigo_representante(int codigo_representante) {
    this.codigo_representante = codigo_representante;
  }

  public Representante getRepresentante() {
    return representante;
  }

  public void setRepresentante(Representante representante) {
    this.representante = representante;
  }
  /*
  public Set<Inscripcion> getInscripcion() {
    return inscripcion;
  }

  public void setInscripcion(Set<Inscripcion> inscripcion) {
    this.inscripcion = inscripcion;
  }
  */
  

}

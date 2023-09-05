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
@Table(name = "Evento")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idE")
    private int idE;
    
    @Column(name = "nombre")
    private  String nombre;

    @Column(name = "fecha_inicio")
    private Date fecha_inicio;

    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "inversion")
    private double inversion;

    @Column(name = "costo")
    private double costo;

    @Override
    public String toString() {
      return "Evento [costo=" + costo + ", descripcion=" + descripcion + ", fecha_fin=" + fecha_fin + ", fecha_inicio="
          + fecha_inicio + ", idE=" + idE + ", inversion=" + inversion + ", nombre=" + nombre + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdE() {
      return idE;
    }

    public void setIdE(int idE) {
      this.idE = idE;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
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

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public double getInversion() {
      return inversion;
    }

    public void setInversion(double inversion) {
      this.inversion = inversion;
    }

    public double getCosto() {
      return costo;
    }

    public void setCosto(double costo) {
      this.costo = costo;
    }

    
}
package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Cargo_Emp")
public class Cargo_Emp implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCARG")
    private int idCARG;
    
    @Column(name = "nombre")
    private  String nombre;

    @Column(name = "sueldo")
    private double sueldo;

    @Column(name = "descripcion")
    private String descripcion;

    @Override
    public String toString() {
      return "Cargo_Emp [idCARG=" + idCARG + ", nombre=" + nombre + ", sueldo=" + sueldo + ", descripcion="
          + descripcion + "]";
    }

    public int getIdCARG() {
      return idCARG;
    }

    public void setIdCARG(int idCARG) {
      this.idCARG = idCARG;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public double getSueldo() {
      return sueldo;
    }

    public void setSueldo(double sueldo) {
      this.sueldo = sueldo;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    
}
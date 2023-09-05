package arce.rojo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellidoP")
    private String apellidoP;

    @Column(name = "apellidoM")
    private String apellidoM;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "genero")
    private boolean genero;
    
    @Column(name = "colegio")
    private String colegio;

    @Override
    public String toString() {
      return "Estudiante [apellidoM=" + apellidoM + ", apellidoP=" + apellidoP + ", codigo=" + codigo + ", colegio="
          + colegio + ", genero=" + genero + ", identificacion=" + identificacion + ", nombre=" + nombre + "]";
    }

    public int getCodigo() {
      return codigo;
    }
    public void setCodigo(int codigo) {
      this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
}
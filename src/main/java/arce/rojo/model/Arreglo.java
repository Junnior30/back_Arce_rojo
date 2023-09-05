package arce.rojo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Arreglo")
public class Arreglo implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAR")
    private int idAR;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "autor")
    private String autor;

    @Column(name = "tono")
    private String tono;

    @Column(name = "codigo_material")
    private int codigo_material;

    @Column(name = "codigo_genero")
    private int codigo_genero;

    @Override
    public String toString() {
      return "Arreglo [autor=" + autor + ", codigo_genero=" + codigo_genero + ", codigo_material=" + codigo_material
          + ", idAR=" + idAR + ", nombre=" + nombre + ", tono=" + tono + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdAR() {
      return idAR;
    }

    public void setIdAR(int idAR) {
      this.idAR = idAR;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getAutor() {
      return autor;
    }

    public void setAutor(String autor) {
      this.autor = autor;
    }

    public String getTono() {
      return tono;
    }

    public void setTono(String tono) {
      this.tono = tono;
    }

    public int getCodigo_material() {
      return codigo_material;
    }

    public void setCodigo_material(int codigo_material) {
      this.codigo_material = codigo_material;
    }

    public int getCodigo_genero() {
      return codigo_genero;
    }

    public void setCodigo_genero(int codigo_genero) {
      this.codigo_genero = codigo_genero;
    }

    
    
}
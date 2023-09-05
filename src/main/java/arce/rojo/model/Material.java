package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Material")
public class Material implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMA")
    private int idMA;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "codigo_evento")
    private int codigo_evento;

    @Override
    public String toString() {
      return "Material [codigo_evento=" + codigo_evento + ", descripcion=" + descripcion + ", idMA=" + idMA
          + ", nombre=" + nombre + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdMA() {
      return idMA;
    }

    public void setIdMA(int idMA) {
      this.idMA = idMA;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public int getCodigo_evento() {
      return codigo_evento;
    }

    public void setCodigo_evento(int codigo_evento) {
      this.codigo_evento = codigo_evento;
    }

    
}


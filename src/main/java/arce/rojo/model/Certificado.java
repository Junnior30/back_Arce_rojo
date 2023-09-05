package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Certificado")
public class Certificado implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCert")
    private int idCert;
    
    @Column(name = "detalle")
    private  String detalle;

    @Column(name = "obs")
    private String obs;

    @Column(name = "codigo_evento")
    private int codigo_evento;

    @Override
    public String toString() {
      return "Certificado [codigo_evento=" + codigo_evento + ", detalle=" + detalle + ", idCert=" + idCert + ", obs="
          + obs + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdCert() {
      return idCert;
    }

    public void setIdCert(int idCert) {
      this.idCert = idCert;
    }

    public String getDetalle() {
      return detalle;
    }

    public void setDetalle(String detalle) {
      this.detalle = detalle;
    }

    public String getObs() {
      return obs;
    }

    public void setObs(String obs) {
      this.obs = obs;
    }

    public int getCodigo_evento() {
      return codigo_evento;
    }

    public void setCodigo_evento(int codigo_evento) {
      this.codigo_evento = codigo_evento;
    }

}

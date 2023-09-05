/* package arce.rojo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idU")
    private int idU;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String pass;

    @Column(name = "codigo_proyecto")
    private String codigo_proyecto;

    @Override
    public String toString() {
      return "Usuario [codigo_proyecto=" + codigo_proyecto + ", email=" + email + ", idU=" + idU + ", pass=" + pass
          + "]";
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public int getIdU() {
      return idU;
    }

    public void setIdU(int idU) {
      this.idU = idU;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getPass() {
      return pass;
    }

    public void setPass(String pass) {
      this.pass = pass;
    }

    public String getCodigo_proyecto() {
      return codigo_proyecto;
    }

    public void setCodigo_proyecto(String codigo_proyecto) {
      this.codigo_proyecto = codigo_proyecto;
    }

    
} */

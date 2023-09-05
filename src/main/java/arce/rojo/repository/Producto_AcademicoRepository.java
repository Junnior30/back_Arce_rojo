package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Producto_Academico;

@Repository
public interface Producto_AcademicoRepository extends JpaRepository<Producto_Academico, Serializable> {
    
}

package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Detalle_Compra;

@Repository
public interface Detalle_CompraRepository extends JpaRepository<Detalle_Compra, Serializable> {
    
}

package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Detalle_Ministerio;

@Repository
public interface Detalle_MinisterioRepository extends JpaRepository<Detalle_Ministerio, Serializable> {
    
}

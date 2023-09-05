package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Recomendacion;

@Repository
public interface RecomendacionRepository extends JpaRepository<Recomendacion, Serializable> {
    
}

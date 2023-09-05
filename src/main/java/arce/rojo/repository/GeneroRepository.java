package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Serializable> {
    
}

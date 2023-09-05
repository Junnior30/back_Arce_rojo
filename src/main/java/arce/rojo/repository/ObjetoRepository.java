package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Objeto;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto, Serializable> {
    
}

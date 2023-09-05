package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Forma_Operacion;

@Repository
public interface Forma_OperacionRepository extends JpaRepository<Forma_Operacion, Serializable> {
    
}

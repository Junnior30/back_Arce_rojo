package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Tipo_Operacion;

@Repository
public interface Tipo_OperacionRepository extends JpaRepository<Tipo_Operacion, Serializable> {
    
}
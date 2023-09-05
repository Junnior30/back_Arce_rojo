package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Detalle_Empleado;

@Repository
public interface Detalle_EmpleadoRepository extends JpaRepository<Detalle_Empleado, Serializable> {
    
}

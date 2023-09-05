package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Detalle_Proyecto;

@Repository
public interface Detalle_ProyectoRepository extends JpaRepository<Detalle_Proyecto, Serializable> {
    
}
package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Detalle_Evento;

@Repository
public interface Detalle_EventoRepository extends JpaRepository<Detalle_Evento, Serializable> {
    
}
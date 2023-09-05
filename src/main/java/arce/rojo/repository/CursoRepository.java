package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Serializable> {
    
}
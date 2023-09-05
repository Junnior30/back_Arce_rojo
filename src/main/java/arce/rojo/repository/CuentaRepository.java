package arce.rojo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Serializable> {
    
}

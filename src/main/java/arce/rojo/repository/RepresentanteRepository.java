package arce.rojo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import arce.rojo.model.Representante;

@Repository
public interface RepresentanteRepository extends JpaRepository<Representante, Serializable>
{


    @Query("select r from Representante r where concat(r.nombres,' ',r.apellidos) like %?1%")
    List<Representante> findNombreOApellido(@Param("nombres") String nombres, @Param("apellidos") String apellidos);

    @Query("select r from Representante r where concat(r.nombres,' ',r.apellidos) like %?1%")
    public boolean existeNombreApellido (@Param("nombres") String nombres, @Param("apellidos") String apellidos);
}
package arce.rojo.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Calificacion;
import arce.rojo.repository.CalificacionRepository;

@Service
@Transactional
public class CalificacionService {
    @Autowired
    CalificacionRepository calificacionRepository;
	
	public List<Calificacion> Listar ()
	{
		return calificacionRepository.findAll();
	}
	
	public Optional<Calificacion> Buscar (Integer idCAL)
	{
		return calificacionRepository.findById(idCAL);
	}
	
	public Calificacion Guardar (Calificacion calificacion)
	{
		return calificacionRepository.save(calificacion);
	}
	
	public void Eliminar (Integer idCAL)
	{
		calificacionRepository.deleteById(idCAL);
	}
	
	public boolean Existe (Integer idCAL)
	{
		return calificacionRepository.existsById(idCAL);
	}
}
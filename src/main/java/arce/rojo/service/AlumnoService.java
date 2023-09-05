package arce.rojo.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Alumno;
import arce.rojo.repository.AlumnoRepository;

@Service
@Transactional
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;
	
	public List<Alumno> Listar ()
	{
		return alumnoRepository.findAll();
	}
	
	public Optional<Alumno> Buscar (Integer idA)
	{
		return alumnoRepository.findById(idA);
	}
	
	public Alumno Guardar (Alumno alumno)
	{
		return alumnoRepository.save(alumno);
	}
	
	public void Eliminar (Integer idA)
	{
		alumnoRepository.deleteById(idA);
	}
	
	public boolean Existe (Integer idA)
	{
		return alumnoRepository.existsById(idA);
	}
}

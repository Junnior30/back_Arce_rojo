package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Inscripcion;
import arce.rojo.repository.InscripcionRepository;

@Service
@Transactional
public class InscripcionService {
    @Autowired
    InscripcionRepository inscripcionRepository;
	
	public List<Inscripcion> Listar ()
	{
		return inscripcionRepository.findAll();
	}
	
	public Optional<Inscripcion> Buscar (Integer idI)
	{
		return inscripcionRepository.findById(idI);
	}
	
	public Inscripcion Guardar (Inscripcion inscripcion)
	{
		return inscripcionRepository.save(inscripcion);
	}
	
	public void Eliminar (Integer idI)
	{
		inscripcionRepository.deleteById(idI);
	}
	
	public boolean Existe (Integer idI)
	{
		return inscripcionRepository.existsById(idI);
	}
}





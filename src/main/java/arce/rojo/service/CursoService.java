package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Curso;
import arce.rojo.repository.CursoRepository;

@Service
@Transactional
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;
	
	public List<Curso> Listar ()
	{
		return cursoRepository.findAll();
	}
	
	public Optional<Curso> Buscar (Integer idCU)
	{
		return cursoRepository.findById(idCU);
	}
	
	public Curso Guardar (Curso curso)
	{
		return cursoRepository.save(curso);
	}
	
	public void Eliminar (Integer idCU)
	{
		cursoRepository.deleteById(idCU);
	}
	
	public boolean Existe (Integer idCU)
	{
		return cursoRepository.existsById(idCU);
	}
}


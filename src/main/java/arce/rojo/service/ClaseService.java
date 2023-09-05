package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Clase;
import arce.rojo.repository.ClaseRepository;

@Service
@Transactional
public class ClaseService {
    @Autowired
    ClaseRepository claseRepository;
	
	public List<Clase> Listar ()
	{
		return claseRepository.findAll();
	}
	
	public Optional<Clase> Buscar (Integer idCLAS)
	{
		return claseRepository.findById(idCLAS);
	}
	
	public Clase Guardar (Clase clase)
	{
		return claseRepository.save(clase);
	}
	
	public void Eliminar (Integer idCLAS)
	{
		claseRepository.deleteById(idCLAS);
	}
	
	public boolean Existe (Integer idCLAS)
	{
		return claseRepository.existsById(idCLAS);
	}
}
package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Recomendacion;
import arce.rojo.repository.RecomendacionRepository;

@Service
@Transactional
public class RecomendacionService {
    @Autowired
    RecomendacionRepository recomendacionRepository;
	
	public List<Recomendacion> Listar ()
	{
		return recomendacionRepository.findAll();
	}
	
	public Optional<Recomendacion> Buscar (Integer iRE)
	{
		return recomendacionRepository.findById(iRE);
	}
	
	public Recomendacion Guardar (Recomendacion recomendacion)
	{
		return recomendacionRepository.save(recomendacion);
	}
	
	public void Eliminar (Integer iRE)
	{
		recomendacionRepository.deleteById(iRE);
	}
	
	public boolean Existe (Integer iRE)
	{
		return recomendacionRepository.existsById(iRE);
	}
}






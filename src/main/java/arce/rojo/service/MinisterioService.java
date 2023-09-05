package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Ministerio;
import arce.rojo.repository.MinisterioRepository;

@Service
@Transactional
public class MinisterioService {
    @Autowired
    MinisterioRepository ministerioRepository;
	
	public List<Ministerio> Listar ()
	{
		return ministerioRepository.findAll();
	}
	
	public Optional<Ministerio> Buscar (Integer idMIN)
	{
		return ministerioRepository.findById(idMIN);
	}
	
	public Ministerio Guardar (Ministerio ministerio)
	{
		return ministerioRepository.save(ministerio);
	}
	
	public void Eliminar (Integer idMIN)
	{
		ministerioRepository.deleteById(idMIN);
	}
	
	public boolean Existe (Integer idMIN)
	{
		return ministerioRepository.existsById(idMIN);
	}
}





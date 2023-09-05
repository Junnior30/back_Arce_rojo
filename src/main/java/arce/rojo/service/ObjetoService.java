package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Objeto;
import arce.rojo.repository.ObjetoRepository;

@Service
@Transactional
public class ObjetoService {
    @Autowired
    ObjetoRepository objetoRepository;
	
	public List<Objeto> Listar ()
	{
		return objetoRepository.findAll();
	}
	
	public Optional<Objeto> Buscar (Integer iOB)
	{
		return objetoRepository.findById(iOB);
	}
	
	public Objeto Guardar (Objeto objeto)
	{
		return objetoRepository.save(objeto);
	}
	
	public void Eliminar (Integer iOB)
	{
		objetoRepository.deleteById(iOB);
	}
	
	public boolean Existe (Integer iOB)
	{
		return objetoRepository.existsById(iOB);
	}
}





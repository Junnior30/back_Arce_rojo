package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Operacion;
import arce.rojo.repository.OperacionRepository;

@Service
@Transactional
public class OperacionService {
    @Autowired
    OperacionRepository operacionRepository;
	
	public List<Operacion> Listar ()
	{
		return operacionRepository.findAll();
	}
	
	public Optional<Operacion> Buscar (Integer iOP)
	{
		return operacionRepository.findById(iOP);
	}
	
	public Operacion Guardar (Operacion operacion)
	{
		return operacionRepository.save(operacion);
	}
	
	public void Eliminar (Integer iOP)
	{
		operacionRepository.deleteById(iOP);
	}
	
	public boolean Existe (Integer iOP)
	{
		return operacionRepository.existsById(iOP);
	}
}





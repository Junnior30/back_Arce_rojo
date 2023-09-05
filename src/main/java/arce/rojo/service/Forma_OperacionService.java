package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Forma_Operacion;
import arce.rojo.repository.Forma_OperacionRepository;

@Service
@Transactional
public class Forma_OperacionService {
    @Autowired
    Forma_OperacionRepository forma_OperacionRepository;
	
	public List<Forma_Operacion> Listar ()
	{
		return forma_OperacionRepository.findAll();
	}
	
	public Optional<Forma_Operacion> Buscar (Integer idFO)
	{
		return forma_OperacionRepository.findById(idFO);
	}
	
	public Forma_Operacion Guardar (Forma_Operacion forma_Operacion)
	{
		return forma_OperacionRepository.save(forma_Operacion);
	}
	
	public void Eliminar (Integer idFO)
	{
		forma_OperacionRepository.deleteById(idFO);
	}
	
	public boolean Existe (Integer idFO)
	{
		return forma_OperacionRepository.existsById(idFO);
	}
}




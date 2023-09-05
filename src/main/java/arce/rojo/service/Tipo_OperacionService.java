package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Tipo_Operacion;
import arce.rojo.repository.Tipo_OperacionRepository;

@Service
@Transactional
public class Tipo_OperacionService {
    @Autowired
    Tipo_OperacionRepository tipo_OperacionRepository;
	
	public List<Tipo_Operacion> Listar ()
	{
		return tipo_OperacionRepository.findAll();
	}
	
	public Optional<Tipo_Operacion> Buscar (Integer idTO)
	{
		return tipo_OperacionRepository.findById(idTO);
	}
	
	public Tipo_Operacion Guardar (Tipo_Operacion tipo_Operacion)
	{
		return tipo_OperacionRepository.save(tipo_Operacion);
	}
	
	public void Eliminar (Integer idTO)
	{
		tipo_OperacionRepository.deleteById(idTO);
	}
	
	public boolean Existe (Integer idTO)
	{
		return tipo_OperacionRepository.existsById(idTO);
	}
}







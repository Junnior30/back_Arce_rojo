package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Detalle_Proyecto;
import arce.rojo.repository.Detalle_ProyectoRepository;

@Service
@Transactional
public class Detalle_ProyectoService {
    @Autowired
    Detalle_ProyectoRepository detalle_ProyectoRepository;
	
	public List<Detalle_Proyecto> Listar ()
	{
		return detalle_ProyectoRepository.findAll();
	}
	
	public Optional<Detalle_Proyecto> Buscar (Integer idDP)
	{
		return detalle_ProyectoRepository.findById(idDP);
	}
	
	public Detalle_Proyecto Guardar (Detalle_Proyecto detalle_Proyecto)
	{
		return detalle_ProyectoRepository.save(detalle_Proyecto);
	}
	
	public void Eliminar (Integer idDP)
	{
		detalle_ProyectoRepository.deleteById(idDP);
	}
	
	public boolean Existe (Integer idDP)
	{
		return detalle_ProyectoRepository.existsById(idDP);
	}
}


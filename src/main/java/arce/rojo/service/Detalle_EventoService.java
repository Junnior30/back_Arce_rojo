package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Detalle_Evento;
import arce.rojo.repository.Detalle_EventoRepository;

@Service
@Transactional
public class Detalle_EventoService {
    @Autowired
    Detalle_EventoRepository detalle_EventoRepository;
	
	public List<Detalle_Evento> Listar ()
	{
		return detalle_EventoRepository.findAll();
	}
	
	public Optional<Detalle_Evento> Buscar (Integer idDE)
	{
		return detalle_EventoRepository.findById(idDE);
	}
	
	public Detalle_Evento Guardar (Detalle_Evento detalle_Evento)
	{
		return detalle_EventoRepository.save(detalle_Evento);
	}
	
	public void Eliminar (Integer idDE)
	{
		detalle_EventoRepository.deleteById(idDE);
	}
	
	public boolean Existe (Integer idDE)
	{
		return detalle_EventoRepository.existsById(idDE);
	}
}


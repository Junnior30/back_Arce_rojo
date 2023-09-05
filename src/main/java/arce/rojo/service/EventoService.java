package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Evento;
import arce.rojo.repository.EventoRepository;

@Service
@Transactional
public class EventoService {
    @Autowired
    EventoRepository eventoRepository;
	
	public List<Evento> Listar ()
	{
		return eventoRepository.findAll();
	}
	
	public Optional<Evento> Buscar (Integer idE)
	{
		return eventoRepository.findById(idE);
	}
	
	public Evento Guardar (Evento evento)
	{
		return eventoRepository.save(evento);
	}
	
	public void Eliminar (Integer idE)
	{
		eventoRepository.deleteById(idE);
	}
	
	public boolean Existe (Integer idE)
	{
		return eventoRepository.existsById(idE);
	}
}



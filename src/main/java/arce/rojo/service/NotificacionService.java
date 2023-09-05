package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Notificacion;
import arce.rojo.repository.NotificacionRepository;

@Service
@Transactional
public class NotificacionService {
    @Autowired
    NotificacionRepository notificacionRepository;
	
	public List<Notificacion> Listar ()
	{
		return notificacionRepository.findAll();
	}
	
	public Optional<Notificacion> Buscar (Integer idN)
	{
		return notificacionRepository.findById(idN);
	}
	
	public Notificacion Guardar (Notificacion notificacion)
	{
		return notificacionRepository.save(notificacion);
	}
	
	public void Eliminar (Integer idN)
	{
		notificacionRepository.deleteById(idN);
	}
	
	public boolean Existe (Integer idN)
	{
		return notificacionRepository.existsById(idN);
	}
}





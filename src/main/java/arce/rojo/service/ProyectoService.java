package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Proyecto;
import arce.rojo.repository.ProyectoRepository;

@Service
@Transactional
public class ProyectoService {
    @Autowired
    ProyectoRepository proyectoRepository;
	
	public List<Proyecto> Listar ()
	{
		return proyectoRepository.findAll();
	}
	
	public Optional<Proyecto> Buscar (Integer iP)
	{
		return proyectoRepository.findById(iP);
	}
	
	public Proyecto Guardar (Proyecto proyecto)
	{
		return proyectoRepository.save(proyecto);
	}
	
	public void Eliminar (Integer iP)
	{
		proyectoRepository.deleteById(iP);
	}
	
	public boolean Existe (Integer iP)
	{
		return proyectoRepository.existsById(iP);
	}
}





package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Empleado;
import arce.rojo.repository.EmpleadoRepository;

@Service
@Transactional
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;
	
	public List<Empleado> Listar ()
	{
		return empleadoRepository.findAll();
	}
	
	public Optional<Empleado> Buscar (Integer idEMP)
	{
		return empleadoRepository.findById(idEMP);
	}
	
	public Empleado Guardar (Empleado empleado)
	{
		return empleadoRepository.save(empleado);
	}
	
	public void Eliminar (Integer idEMP)
	{
		empleadoRepository.deleteById(idEMP);
	}
	
	public boolean Existe (Integer idEMP)
	{
		return empleadoRepository.existsById(idEMP);
	}
}


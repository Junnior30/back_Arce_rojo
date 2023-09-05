package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Detalle_Empleado;
import arce.rojo.repository.Detalle_EmpleadoRepository;

@Service
@Transactional
public class Detalle_EmpleadoService {
    @Autowired
    Detalle_EmpleadoRepository detalle_EmpleadoRepository;
	
	public List<Detalle_Empleado> Listar ()
	{
		return detalle_EmpleadoRepository.findAll();
	}
	
	public Optional<Detalle_Empleado> Buscar (Integer idDEM)
	{
		return detalle_EmpleadoRepository.findById(idDEM);
	}
	
	public Detalle_Empleado Guardar (Detalle_Empleado detalle_Empleado)
	{
		return detalle_EmpleadoRepository.save(detalle_Empleado);
	}
	
	public void Eliminar (Integer idDEM)
	{
		detalle_EmpleadoRepository.deleteById(idDEM);
	}
	
	public boolean Existe (Integer idDEM)
	{
		return detalle_EmpleadoRepository.existsById(idDEM);
	}
}


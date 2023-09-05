package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Cuenta;
import arce.rojo.repository.CuentaRepository;

@Service
@Transactional
public class CuentaService {
    @Autowired
    CuentaRepository cuentaRepository;
	
	public List<Cuenta> Listar ()
	{
		return cuentaRepository.findAll();
	}
	
	public Optional<Cuenta> Buscar (Integer idCUENTA)
	{
		return cuentaRepository.findById(idCUENTA);
	}
	
	public Cuenta Guardar (Cuenta cuenta)
	{
		return cuentaRepository.save(cuenta);
	}
	
	public void Eliminar (Integer idCUENTA)
	{
		cuentaRepository.deleteById(idCUENTA);
	}
	
	public boolean Existe (Integer idCUENTA)
	{
		return cuentaRepository.existsById(idCUENTA);
	}
}


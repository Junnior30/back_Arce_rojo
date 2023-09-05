package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Donacion;
import arce.rojo.repository.DonacionRepository;

@Service
@Transactional
public class DonacionService {
    @Autowired
    DonacionRepository donacionRepository;
	
	public List<Donacion> Listar ()
	{
		return donacionRepository.findAll();
	}
	
	public Optional<Donacion> Buscar (Integer idDO)
	{
		return donacionRepository.findById(idDO);
	}
	
	public Donacion Guardar (Donacion donacion)
	{
		return donacionRepository.save(donacion);
	}
	
	public void Eliminar (Integer idDO)
	{
		donacionRepository.deleteById(idDO);
	}
	
	public boolean Existe (Integer idDO)
	{
		return donacionRepository.existsById(idDO);
	}
}


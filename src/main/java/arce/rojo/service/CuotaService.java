package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Cuota;
import arce.rojo.repository.CuotaRepository;

@Service
@Transactional
public class CuotaService {
    @Autowired
    CuotaRepository cuotaRepository;
	
	public List<Cuota> Listar ()
	{
		return cuotaRepository.findAll();
	}
	
	public Optional<Cuota> Buscar (Integer idC)
	{
		return cuotaRepository.findById(idC);
	}
	
	public Cuota Guardar (Cuota cuota)
	{
		return cuotaRepository.save(cuota);
	}
	
	public void Eliminar (Integer idC)
	{
		cuotaRepository.deleteById(idC);
	}
	
	public boolean Existe (Integer idC)
	{
		return cuotaRepository.existsById(idC);
	}
}


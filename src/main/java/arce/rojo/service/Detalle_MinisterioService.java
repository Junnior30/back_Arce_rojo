package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Detalle_Ministerio;
import arce.rojo.repository.Detalle_MinisterioRepository;

@Service
@Transactional
public class Detalle_MinisterioService {
    @Autowired
    Detalle_MinisterioRepository detalle_MinisterioRepository;
	
	public List<Detalle_Ministerio> Listar ()
	{
		return detalle_MinisterioRepository.findAll();
	}
	
	public Optional<Detalle_Ministerio> Buscar (Integer idDM)
	{
		return detalle_MinisterioRepository.findById(idDM);
	}
	
	public Detalle_Ministerio Guardar (Detalle_Ministerio detalle_Ministerio)
	{
		return detalle_MinisterioRepository.save(detalle_Ministerio);
	}
	
	public void Eliminar (Integer idDM)
	{
		detalle_MinisterioRepository.deleteById(idDM);
	}
	
	public boolean Existe (Integer idDM)
	{
		return detalle_MinisterioRepository.existsById(idDM);
	}
}


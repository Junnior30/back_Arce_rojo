package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Material;
import arce.rojo.repository.MaterialRepository;

@Service
@Transactional
public class MaterialService {
    @Autowired
    MaterialRepository materialRepository;
	
	public List<Material> Listar ()
	{
		return materialRepository.findAll();
	}
	
	public Optional<Material> Buscar (Integer idMA)
	{
		return materialRepository.findById(idMA);
	}
	
	public Material Guardar (Material material)
	{
		return materialRepository.save(material);
	}
	
	public void Eliminar (Integer idMA)
	{
		materialRepository.deleteById(idMA);
	}
	
	public boolean Existe (Integer idMA)
	{
		return materialRepository.existsById(idMA);
	}
}





package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Producto_Academico;
import arce.rojo.repository.Producto_AcademicoRepository;

@Service
@Transactional
public class Producto_AcademicoService {
    @Autowired
    Producto_AcademicoRepository producto_AcademicoRepository;
	
	public List<Producto_Academico> Listar ()
	{
		return producto_AcademicoRepository.findAll();
	}
	
	public Optional<Producto_Academico> Buscar (Integer iPA)
	{
		return producto_AcademicoRepository.findById(iPA);
	}
	
	public Producto_Academico Guardar (Producto_Academico producto_Academico)
	{
		return producto_AcademicoRepository.save(producto_Academico);
	}
	
	public void Eliminar (Integer iPA)
	{
		producto_AcademicoRepository.deleteById(iPA);
	}
	
	public boolean Existe (Integer iPA)
	{
		return producto_AcademicoRepository.existsById(iPA);
	}
}





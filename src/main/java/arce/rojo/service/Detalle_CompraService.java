package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Detalle_Compra;
import arce.rojo.repository.Detalle_CompraRepository;

@Service
@Transactional
public class Detalle_CompraService {
    @Autowired
    Detalle_CompraRepository detalle_CompraRepository;
	
	public List<Detalle_Compra> Listar ()
	{
		return detalle_CompraRepository.findAll();
	}
	
	public Optional<Detalle_Compra> Buscar (Integer idDC)
	{
		return detalle_CompraRepository.findById(idDC);
	}
	
	public Detalle_Compra Guardar (Detalle_Compra detalle_Compra)
	{
		return detalle_CompraRepository.save(detalle_Compra);
	}
	
	public void Eliminar (Integer idDC)
	{
		detalle_CompraRepository.deleteById(idDC);
	}
	
	public boolean Existe (Integer idDC)
	{
		return detalle_CompraRepository.existsById(idDC);
	}
}


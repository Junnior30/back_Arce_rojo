package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Factura;
import arce.rojo.repository.FacturaRepository;

@Service
@Transactional
public class FacturaService {
    @Autowired
    FacturaRepository facturaRepository;
	
	public List<Factura> Listar ()
	{
		return facturaRepository.findAll();
	}
	
	public Optional<Factura> Buscar (Integer idFA)
	{
		return facturaRepository.findById(idFA);
	}
	
	public Factura Guardar (Factura factura)
	{
		return facturaRepository.save(factura);
	}
	
	public void Eliminar (Integer idFA)
	{
		facturaRepository.deleteById(idFA);
	}
	
	public boolean Existe (Integer idFA)
	{
		return facturaRepository.existsById(idFA);
	}
}




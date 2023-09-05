package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Compra;
import arce.rojo.repository.CompraRepository;

@Service
@Transactional
public class CompraService {
    @Autowired
    CompraRepository compraRepository;
	
	public List<Compra> Listar ()
	{
		return compraRepository.findAll();
	}
	
	public Optional<Compra> Buscar (Integer idCOMPRA)
	{
		return compraRepository.findById(idCOMPRA);
	}
	
	public Compra Guardar (Compra compra)
	{
		return compraRepository.save(compra);
	}
	
	public void Eliminar (Integer idCOMPRA)
	{
		compraRepository.deleteById(idCOMPRA);
	}
	
	public boolean Existe (Integer idCOMPRA)
	{
		return compraRepository.existsById(idCOMPRA);
	}
}

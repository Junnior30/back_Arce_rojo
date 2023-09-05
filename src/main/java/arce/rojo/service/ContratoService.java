package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Contrato;
import arce.rojo.repository.ContratoRepository;

@Service
@Transactional
public class ContratoService {
    @Autowired
    ContratoRepository contratoRepository;
	
	public List<Contrato> Listar ()
	{
		return contratoRepository.findAll();
	}
	
	public Optional<Contrato> Buscar (Integer idCO)
	{
		return contratoRepository.findById(idCO);
	}
	
	public Contrato Guardar (Contrato contrato)
	{
		return contratoRepository.save(contrato);
	}
	
	public void Eliminar (Integer idCO)
	{
		contratoRepository.deleteById(idCO);
	}
	
	public boolean Existe (Integer idCO)
	{
		return contratoRepository.existsById(idCO);
	}
}


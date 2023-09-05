package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Cliente;
import arce.rojo.repository.ClienteRepository;

@Service
@Transactional
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
	
	public List<Cliente> Listar ()
	{
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> Buscar (Integer idCLI)
	{
		return clienteRepository.findById(idCLI);
	}
	
	public Cliente Guardar (Cliente cliente)
	{
		return clienteRepository.save(cliente);
	}
	
	public void Eliminar (Integer idCLI)
	{
		clienteRepository.deleteById(idCLI);
	}
	
	public boolean Existe (Integer idCLI)
	{
		return clienteRepository.existsById(idCLI);
	}
}

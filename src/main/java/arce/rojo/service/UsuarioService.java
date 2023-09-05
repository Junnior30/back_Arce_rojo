/* package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Usuario;
import arce.rojo.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
	
	public List<Usuario> Listar ()
	{
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> Buscar (Integer idU)
	{
		return usuarioRepository.findById(idU);
	}
	
	public Usuario Guardar (Usuario usuario)
	{
		return usuarioRepository.save(usuario);
	}
	
	public void Eliminar (Integer idU)
	{
		usuarioRepository.deleteById(idU);
	}
	
	public boolean Existe (Integer idU)
	{
		return usuarioRepository.existsById(idU);
	}
}

 */






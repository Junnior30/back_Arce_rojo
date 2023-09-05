package arce.rojo.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Genero;
import arce.rojo.repository.GeneroRepository;

@Service
@Transactional
public class GeneroService {
    @Autowired
    GeneroRepository generoRepository;
	
	public List<Genero> Listar ()
	{
		return generoRepository.findAll();
	}
	
	public Optional<Genero> Buscar (Integer idGE)
	{
		return generoRepository.findById(idGE);
	}
	
	public Genero Guardar (Genero genero)
	{
		return generoRepository.save(genero);
	}
	
	public void Eliminar (Integer idGE)
	{
		generoRepository.deleteById(idGE);
	}
	
	public boolean Existe (Integer idGE)
	{
		return generoRepository.existsById(idGE);
	}
}





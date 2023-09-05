package arce.rojo.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Arreglo;
import arce.rojo.repository.ArregloRepository;

@Service
@Transactional
public class ArregloService {
    @Autowired
    ArregloRepository arregloRepository;
	
	public List<Arreglo> Listar ()
	{
		return arregloRepository.findAll();
	}
	
	public Optional<Arreglo> Buscar (Integer idAR)
	{
		return arregloRepository.findById(idAR);
	}
	
	public Arreglo Guardar (Arreglo arreglo)
	{
		return arregloRepository.save(arreglo);
	}
	
	public void Eliminar (Integer idAR)
	{
		arregloRepository.deleteById(idAR);
	}
	
	public boolean Existe (Integer idAR)
	{
		return arregloRepository.existsById(idAR);
	}
}
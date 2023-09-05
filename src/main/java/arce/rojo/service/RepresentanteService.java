package arce.rojo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arce.rojo.model.Representante;
import arce.rojo.repository.RepresentanteRepository;

@Service
@Transactional
public class RepresentanteService {
    @Autowired
	RepresentanteRepository representanteRepository;
	
	public List<Representante> Listar ()
	{
		return representanteRepository.findAll();
	}
	
	public Optional<Representante> Buscar (Integer idR)
	{
		return representanteRepository.findById(idR);
	}
	public Representante Guardar (Representante representante)
	{
		return representanteRepository.save(representante);
	}
	
	public void Eliminar (Integer idR)
	{
		representanteRepository.deleteById(idR);
	}
	
	public boolean Existe ( Integer idR)
	{
		return representanteRepository.existsById(idR);
	}
}
package arce.rojo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arce.rojo.model.Estudiante;
import arce.rojo.repository.EstudianteRepository;

@Service
@Transactional
public class EstudianteService {
    @Autowired
	EstudianteRepository estudianteRepository;
	
	public List<Estudiante> Listar ()
	{
		return estudianteRepository.findAll();
	}
	
	public Optional<Estudiante> Buscar (Integer codigo)
	{
		return estudianteRepository.findById(codigo);
	}
	
	public Estudiante Guardar (Estudiante estudiante)
	{
		return estudianteRepository.save(estudiante);
	}
	
	public void Eliminar (Integer codigo)
	{
		estudianteRepository.deleteById(codigo);
	}
	
	public boolean Existe (Integer codigo)
	{
		return estudianteRepository.existsById(codigo);
	}
}
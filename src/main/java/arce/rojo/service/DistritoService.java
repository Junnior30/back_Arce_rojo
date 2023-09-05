package arce.rojo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arce.rojo.model.Distrito;
import arce.rojo.repository.DistritoRepository;

@Service
@Transactional
public class DistritoService {
    @Autowired
  DistritoRepository distritoRepository;
	
	public List<Distrito> Listar ()
	{
		return distritoRepository.findAll();
	}
	
	public Optional<Distrito> Buscar (Integer idD)
	{
		return distritoRepository.findById(idD);
	}
	
	public Distrito Guardar (Distrito distrito)
	{
		return distritoRepository.save(distrito);
	}
	
	public void Eliminar (Integer idD)
	{
		distritoRepository.deleteById(idD);
	}
	
	public boolean Existe (Integer idD)
	{
		return distritoRepository.existsById(idD);
	}
}

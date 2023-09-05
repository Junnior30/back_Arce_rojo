package arce.rojo.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Cargo_Emp;
import arce.rojo.repository.Cargo_EmpRepository;

@Service
@Transactional
public class Cargo_EmpService {
    @Autowired
    Cargo_EmpRepository cargo_EmpRepository;
	
	public List<Cargo_Emp> Listar ()
	{
		return cargo_EmpRepository.findAll();
	}
	
	public Optional<Cargo_Emp> Buscar (Integer idCARG)
	{
		return cargo_EmpRepository.findById(idCARG);
	}
	
	public Cargo_Emp Guardar (Cargo_Emp cargo_Emp)
	{
		return cargo_EmpRepository.save(cargo_Emp);
	}
	
	public void Eliminar (Integer idCARG)
	{
		cargo_EmpRepository.deleteById(idCARG);
	}
	
	public boolean Existe (Integer idCARG)
	{
		return cargo_EmpRepository.existsById(idCARG);
	}
}
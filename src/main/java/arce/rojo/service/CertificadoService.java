package arce.rojo.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import arce.rojo.model.Certificado;
import arce.rojo.repository.CertificadoRepository;

@Service
@Transactional
public class CertificadoService {
    @Autowired
    CertificadoRepository certificadoRepository;
	
	public List<Certificado> Listar ()
	{
		return certificadoRepository.findAll();
	}
	
	public Optional<Certificado> Buscar (Integer idCert)
	{
		return certificadoRepository.findById(idCert);
	}
	
	public Certificado Guardar (Certificado certificado)
	{
		return certificadoRepository.save(certificado);
	}
	
	public void Eliminar (Integer idCert)
	{
		certificadoRepository.deleteById(idCert);
	}
	
	public boolean Existe (Integer idCert)
	{
		return certificadoRepository.existsById(idCert);
	}
}
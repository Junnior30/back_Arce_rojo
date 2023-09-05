package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Certificado;
import arce.rojo.service.CertificadoService;
@RestController
@RequestMapping("/certificado")
public class CertificadoController {
    @Autowired
    CertificadoService certificadoService;
    
    @GetMapping(path = "/list")
    public List<Certificado> Listar ()
    {
        return certificadoService.Listar();
    }
    
    @GetMapping(path = "/search/{idCert}")
    public Certificado Buscar (@PathVariable Integer idCert)
    {
        if (!certificadoService.Existe(idCert)) {}
        return certificadoService.Buscar(idCert).get();
    }
    
    @PostMapping(path = "/create")
    public Certificado Registrar (@RequestBody Certificado certificado)
    {
        return certificadoService.Guardar(certificado);
    }
    
    @PutMapping("/update/{idCARG}")
    public void Actualizar (@PathVariable Integer idCert, @RequestBody Certificado certificado)
    {
        if (certificadoService.Existe(idCert))
        {
          Certificado actualizar = certificadoService.Buscar(idCert).get();
             actualizar.setDetalle(certificado.getDetalle());
             actualizar.setObs(certificado.getObs());
             actualizar.setCodigo_evento(certificado.getCodigo_evento());
            certificadoService.Guardar(actualizar);
          
        }
    } 
    
    @DeleteMapping(path = "/delete/{idCert}")
    public void Eliminar (@PathVariable Integer idCert)
    {
        if (certificadoService.Existe(idCert))
        {
            certificadoService.Eliminar(idCert);
        }
    }
}

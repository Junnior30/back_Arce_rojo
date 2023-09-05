package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Contrato;
import arce.rojo.service.ContratoService;
@RestController
@RequestMapping("/contrato")
public class ContratoController {
    @Autowired
    ContratoService contratoService;
    
    @GetMapping(path = "/list")
    public List<Contrato> Listar ()
    {
        return contratoService.Listar();
    }
    
    @GetMapping(path = "/search/{idCO}")
    public Contrato Buscar (@PathVariable Integer idCO)
    {
        if (!contratoService.Existe(idCO)) {}
        return contratoService.Buscar(idCO).get();
    }
    
    @PostMapping(path = "/create")
    public Contrato Registrar (@RequestBody Contrato contrato)
    {
        return contratoService.Guardar(contrato);
    }
    
   /*  @PutMapping("/update/{idCO}")
    public void Actualizar (@PathVariable("idCO") Integer idCO, @RequestBody Contrato contrato)
    {
        if (contratoService.Existe(idCO))
        {
          Contrato actualizar = contratoService.Buscar(idCO).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            contratoService.Guardar(actualizar);
          
        }
    }  */
    
    /* @DeleteMapping(path = "/delete/{idCAL}")
    public void Eliminar (@PathVariable("idCAL") Integer idCAL)
    {
        if (calificacionService.Existe(idCAL))
        {
          calificacionService.Eliminar(idCAL);
        }
    } */
}

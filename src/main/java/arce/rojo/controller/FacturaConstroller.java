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
import arce.rojo.model.Factura;
import arce.rojo.service.FacturaService;
@RestController
@RequestMapping("/factura")
public class FacturaConstroller {
    @Autowired
    FacturaService facturaService;
    
    @GetMapping(path = "/list")
    public List<Factura> Listar ()
    {
        return facturaService.Listar();
    }
    
    @GetMapping(path = "/search/{idFA}")
    public Factura Buscar (@PathVariable Integer idFA)
    {
        if (!facturaService.Existe(idFA)) {}
        return facturaService.Buscar(idFA).get();
    }
    
    @PostMapping(path = "/create")
    public Factura Registrar (@RequestBody Factura factura)
    {
        return facturaService.Guardar(factura);
    }
    
    /* @PutMapping("/update/{idFA}")
    public void Actualizar (@PathVariable("idFA") Integer idFA, @RequestBody Factura factura)
    {
        if (facturaService.Existe(idFA))
        {
          Factura actualizar = facturaService.Buscar(idFA).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            facturaService.Guardar(actualizar);
          
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





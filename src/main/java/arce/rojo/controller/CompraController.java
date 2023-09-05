package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Compra;
import arce.rojo.service.CompraService;
@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    CompraService compraService;
    
    @GetMapping(path = "/list")
    public List<Compra> Listar ()
    {
        return compraService.Listar();
    }
    
    @GetMapping(path = "/search/{idCOMPRA}")
    public Compra Buscar (@PathVariable Integer idCOMPRA)
    {
        if (!compraService.Existe(idCOMPRA)) {}
        return compraService.Buscar(idCOMPRA).get();
    }
    
    @PostMapping(path = "/create")
    public Compra Registrar (@RequestBody Compra compra)
    {
        return compraService.Guardar(compra);
    }
    
    @PutMapping("/update/{idCOMPRA}")
    public void Actualizar (@PathVariable Integer idCOMPRA, @RequestBody Compra compra)
    {
        if (compraService.Existe(idCOMPRA))
        {
          Compra actualizar = compraService.Buscar(idCOMPRA).get();
            actualizar.setDescripcion(compra.getDescripcion());
            
            compraService.Guardar(actualizar);
          
        }
    } 
    
    /* @DeleteMapping(path = "/delete/{idCAL}")
    public void Eliminar (@PathVariable("idCAL") Integer idCAL)
    {
        if (calificacionService.Existe(idCAL))
        {
          calificacionService.Eliminar(idCAL);
        }
    } */
}

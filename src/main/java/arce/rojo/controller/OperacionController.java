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
import arce.rojo.model.Operacion;
import arce.rojo.service.OperacionService;
@RestController
@RequestMapping("/operacion")
public class OperacionController {
    @Autowired
    OperacionService operacionService;
    
    @GetMapping(path = "/list")
    public List<Operacion> Listar ()
    {
        return operacionService.Listar();
    }
    
    @GetMapping(path = "/search/{idOP}")
    public Operacion Buscar (@PathVariable Integer idOP)
    {
        if (!operacionService.Existe(idOP)) {}
        return operacionService.Buscar(idOP).get();
    }
    
    @PostMapping(path = "/create")
    public Operacion Registrar (@RequestBody Operacion operacion)
    {
        return operacionService.Guardar(operacion);
    }
    
    /* @PutMapping("/update/{idOP}")
    public void Actualizar (@PathVariable("idOP") Integer idOP, @RequestBody Operacion operacion)
    {
        if (operacionService.Existe(idOP))
        {
          Operacion actualizar = operacionService.Buscar(idOP).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            operacionService.Guardar(actualizar);
          
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





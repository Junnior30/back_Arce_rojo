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
import arce.rojo.model.Ministerio;
import arce.rojo.service.MinisterioService;
@RestController
@RequestMapping("/ministerio")
public class MinisterioController {
    @Autowired
    MinisterioService ministerioService;
    
    @GetMapping(path = "/list")
    public List<Ministerio> Listar ()
    {
        return ministerioService.Listar();
    }
    
    @GetMapping(path = "/search/{idMIN}")
    public Ministerio Buscar (@PathVariable Integer idMIN)
    {
        if (!ministerioService.Existe(idMIN)) {}
        return ministerioService.Buscar(idMIN).get();
    }
    
    @PostMapping(path = "/create")
    public Ministerio Registrar (@RequestBody Ministerio ministerio)
    {
        return ministerioService.Guardar(ministerio);
    }
    
   /*  @PutMapping("/update/{idMIN}")
    public void Actualizar (@PathVariable("idMIN") Integer idMIN, @RequestBody Ministerio ministerio)
    {
        if (ministerioService.Existe(idMIN))
        {
          Ministerio actualizar = ministerioService.Buscar(idMIN).get();
            actualizar.setDescripcion(ministerio.getDescripcion());
            ministerioService.Guardar(actualizar);
          
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





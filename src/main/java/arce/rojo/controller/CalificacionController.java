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
import arce.rojo.model.Calificacion;
import arce.rojo.service.CalificacionService;
@RestController
@RequestMapping("/calificacion")
public class CalificacionController {
    @Autowired
    CalificacionService calificacionService;
    
    @GetMapping(path = "/list")
    public List<Calificacion> Listar ()
    {
        return calificacionService.Listar();
    }
    
    @GetMapping(path = "/search/{idCAL}")
    public Calificacion Buscar (@PathVariable Integer idCAL)
    {
        if (!calificacionService.Existe(idCAL)) {}
        return calificacionService.Buscar(idCAL).get();
    }
    
    @PostMapping(path = "/create")
    public Calificacion Registrar (@RequestBody Calificacion calificacion)
    {
        return calificacionService.Guardar(calificacion);
    }
    
    @PutMapping("/update/{idCAL}")
    public void Actualizar (@PathVariable Integer idCAL, @RequestBody Calificacion calificacion)
    {
        if (calificacionService.Existe(idCAL))
        {
          Calificacion actualizar = calificacionService.Buscar(idCAL).get();
            actualizar.setDescripcion(calificacion.getDescripcion());
            calificacionService.Guardar(actualizar);
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

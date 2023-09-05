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
import arce.rojo.model.Recomendacion;
import arce.rojo.service.RecomendacionService;
@RestController
@RequestMapping("/recomendacion")
public class RecomendacionController {
    @Autowired
    RecomendacionService recomendacionService;
    
    @GetMapping(path = "/list")
    public List<Recomendacion> Listar ()
    {
        return recomendacionService.Listar();
    }
    
    @GetMapping(path = "/search/{idRE}")
    public Recomendacion Buscar (@PathVariable Integer idRE)
    {
        if (!recomendacionService.Existe(idRE)) {}
        return recomendacionService.Buscar(idRE).get();
    }
    
    @PostMapping(path = "/create")
    public Recomendacion Registrar (@RequestBody Recomendacion recomendacion)
    {
        return recomendacionService.Guardar(recomendacion);
    }
    
    @PutMapping("/update/{idRE}")
    public void Actualizar (@PathVariable Integer idRE, @RequestBody Recomendacion recomendacion)
    {
        if (recomendacionService.Existe(idRE))
        {
          Recomendacion actualizar = recomendacionService.Buscar(idRE).get();
            actualizar.setDetalle(recomendacion.getDetalle());
            actualizar.setCodigo_empleado(recomendacion.getCodigo_empleado());
            recomendacionService.Guardar(actualizar);
          
        }
    } 
    
    @DeleteMapping(path = "/delete/{idRE}")
    public void Eliminar (@PathVariable Integer idRE)
    {
        if (recomendacionService.Existe(idRE))
        {
            recomendacionService.Eliminar(idRE);
        }
    }
}






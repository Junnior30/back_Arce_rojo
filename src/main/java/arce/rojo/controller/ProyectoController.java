package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Proyecto;
import arce.rojo.service.ProyectoService;
@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
    ProyectoService proyectoService;
    
    @GetMapping(path = "/list")
    public List<Proyecto> Listar()
    {
        return proyectoService.Listar();
    }
    
    @GetMapping(path = "/search/{idP}")
    public Proyecto Buscar (@PathVariable Integer idP)
    {
        if (!proyectoService.Existe(idP)) {}
        return proyectoService.Buscar(idP).get();
    }
    
    @PostMapping(path = "/create")
    public Proyecto Registrar (@RequestBody Proyecto proyecto)
    {
        return proyectoService.Guardar(proyecto);
    }
    
    @PutMapping("/update/{idP}")
    public void Actualizar (@PathVariable Integer idP, @RequestBody Proyecto proyecto)
    {
        if (proyectoService.Existe(idP))
        {
          Proyecto actualizar = proyectoService.Buscar(idP).get();
            actualizar.setNombre(proyecto.getNombre());
            actualizar.setDescripcion(proyecto.getDescripcion());
            actualizar.setEstado(proyecto.isEstado());
            actualizar.setCosto(proyecto.getCosto());
            actualizar.setInscripcion(proyecto.getInscripcion());
            proyectoService.Guardar(actualizar);
          
        }
    } 
    
    @DeleteMapping(path = "/delete/{idP}")
    public void Eliminar (@PathVariable Integer idP)
    {
        if (proyectoService.Existe(idP))
        {
            proyectoService.Eliminar(idP);
        }
    }
}






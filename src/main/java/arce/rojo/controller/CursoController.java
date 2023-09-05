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
import arce.rojo.model.Curso;
import arce.rojo.service.CursoService;
@RestController
@RequestMapping("/curso")
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
    @Autowired
    CursoService cursoService;
    
    @GetMapping(path = "/list")
    public List<Curso> Listar ()
    {
        return cursoService.Listar();
    }
    
    @GetMapping(path = "/search/{idCU}")
    public Curso Buscar (@PathVariable Integer idCU)
    {
        if (!cursoService.Existe(idCU)) {}
        return cursoService.Buscar(idCU).get();
    }
    
    @PostMapping(path = "/create")
    public Curso Registrar (@RequestBody Curso curso)
    {
        return cursoService.Guardar(curso);
    }
    
    @PutMapping("/update/{idCU}")
    public void Actualizar (@PathVariable Integer idCU, @RequestBody Curso curso)
    {
        if (cursoService.Existe(idCU))
        {
          Curso actualizar = cursoService.Buscar(idCU).get();
            actualizar.setNombre(curso.getNombre());
            actualizar.setDescripcion(curso.getDescripcion());
            cursoService.Guardar(actualizar);
          
        }
    } 
    
    @DeleteMapping(path = "/delete/{idCU}")
    public void Eliminar (@PathVariable Integer idCU)
    {
        if (cursoService.Existe(idCU))
        {
            cursoService.Eliminar(idCU);
        }
    }
}


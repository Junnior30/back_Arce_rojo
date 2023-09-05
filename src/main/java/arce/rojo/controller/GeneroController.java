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
import arce.rojo.model.Genero;
import arce.rojo.service.GeneroService;
@RestController
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    GeneroService generoService;
    
    @GetMapping(path = "/list")
    public List<Genero> Listar ()
    {
        return generoService.Listar();
    }
    
    @GetMapping(path = "/search/{idGE}")
    public Genero Buscar (@PathVariable Integer idGE)
    {
        if (!generoService.Existe(idGE)) {}
        return generoService.Buscar(idGE).get();
    }
    
    @PostMapping(path = "/create")
    public Genero Registrar (@RequestBody Genero genero)
    {
        return generoService.Guardar(genero);
    }
    
    @PutMapping("/update/{idFO}")
    public void Actualizar (@PathVariable Integer idGE, @RequestBody Genero genero)
    {
        if (generoService.Existe(idGE))
        {
          Genero actualizar = generoService.Buscar(idGE).get();
            actualizar.setNombre(genero.getNombre());
            generoService.Guardar(actualizar);
          
        }
    } 
    
    @DeleteMapping(path = "/delete/{idCAL}")
    public void Eliminar (@PathVariable Integer idGE)
    {
        if (generoService.Existe(idGE))
        {
            generoService.Eliminar(idGE);
        }
    }
}





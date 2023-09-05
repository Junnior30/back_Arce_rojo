package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Clase;
import arce.rojo.service.ClaseService;
@RestController
@RequestMapping("/clase")
@CrossOrigin(origins = "http://localhost:4200")
public class ClaseController {
    @Autowired
    ClaseService claseService;
    
    @GetMapping(path = "/list")
    public List<Clase> Listar ()
    {
        return claseService.Listar();
    }
    
    @GetMapping(path = "/search/{idCLAS}")
    public Clase Buscar (@PathVariable Integer idCLAS)
    {
        if (!claseService.Existe(idCLAS)) {}
        return claseService.Buscar(idCLAS).get();
    }
    
    @PostMapping(path = "/create")
    public Clase Registrar (@RequestBody Clase clase)
    {
        return claseService.Guardar(clase);
    }
    
    @PutMapping("/update/{idCLAS}")
    public void Actualizar (@PathVariable Integer idCLAS, @RequestBody Clase clase)
    {
        if (claseService.Existe(idCLAS))
        {
            Clase actualizar = claseService.Buscar(idCLAS).get();
            actualizar.setEstado(clase.isEstado());
            actualizar.setCodigo_docente(clase.getCodigo_docente());
            claseService.Guardar(actualizar);
          
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

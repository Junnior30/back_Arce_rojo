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
import arce.rojo.model.Forma_Operacion;
import arce.rojo.service.Forma_OperacionService;
@RestController
@RequestMapping("/forma_Operacion")
public class Forma_OperacionController {
    @Autowired
    Forma_OperacionService forma_OperacionService;
    
    @GetMapping(path = "/list")
    public List<Forma_Operacion> Listar ()
    {
        return forma_OperacionService.Listar();
    }
    
    @GetMapping(path = "/search/{idFO}")
    public Forma_Operacion Buscar (@PathVariable Integer idFO)
    {
        if (!forma_OperacionService.Existe(idFO)) {}
        return forma_OperacionService.Buscar(idFO).get();
    }
    
    @PostMapping(path = "/create")
    public Forma_Operacion Registrar (@RequestBody Forma_Operacion forma_Operacion)
    {
        return forma_OperacionService.Guardar(forma_Operacion);
    }
    
    @PutMapping("/update/{idFO}")
    public void Actualizar (@PathVariable Integer idFO, @RequestBody Forma_Operacion forma_Operacion)
    {
        if (forma_OperacionService.Existe(idFO))
        {
          Forma_Operacion actualizar = forma_OperacionService.Buscar(idFO).get();
            actualizar.setNombre(forma_Operacion.getNombre());
            forma_OperacionService.Guardar(actualizar);
          
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





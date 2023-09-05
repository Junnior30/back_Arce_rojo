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
import arce.rojo.model.Detalle_Evento;
import arce.rojo.service.Detalle_EventoService;
@RestController
@RequestMapping("/detalle_Evento")
public class Detalle_EventoController {
    @Autowired
    Detalle_EventoService detalle_EventoService;
    
    @GetMapping(path = "/list")
    public List<Detalle_Evento> Listar ()
    {
        return detalle_EventoService.Listar();
    }
    
    @GetMapping(path = "/search/{idDE}")
    public Detalle_Evento Buscar (@PathVariable Integer idDE)
    {
        if (!detalle_EventoService.Existe(idDE)) {}
        return detalle_EventoService.Buscar(idDE).get();
    }
    
    @PostMapping(path = "/create")
    public Detalle_Evento Registrar (@RequestBody Detalle_Evento detalle_Evento)
    {
        return detalle_EventoService.Guardar(detalle_Evento);
    }
    
 /*    @PutMapping("/update/{idDE}")
    public void Actualizar (@PathVariable("idDE") Integer idDE, @RequestBody Detalle_Evento detalle_Evento)
    {
        if (detalle_EventoService.Existe(idDE))
        {
          Detalle_Evento actualizar = detalle_EventoService.Buscar(idDE).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            detalle_EventoService.Guardar(actualizar);
          
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



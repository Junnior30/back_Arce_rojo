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
import arce.rojo.model.Evento;
import arce.rojo.service.EventoService;
@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    EventoService eventoService;
    
    @GetMapping(path = "/list")
    public List<Evento> Listar ()
    {
        return eventoService.Listar();
    }
    
    @GetMapping(path = "/search/{idE}")
    public Evento Buscar (@PathVariable("idE") Integer id_evento)
    {
        if (!eventoService.Existe(id_evento)) {}
        return eventoService.Buscar(id_evento).get();
    }
    
    @PostMapping(path = "/create")
    public Evento Registrar (@RequestBody Evento evento)
    {
        return eventoService.Guardar(evento);
    }
    
    @PutMapping("/update/{idE}")
    public void Actualizar (@PathVariable Integer idE, @RequestBody Evento evento)
    {
        if (eventoService.Existe(idE))
        {
          Evento actualizar = eventoService.Buscar(idE).get();
            actualizar.setNombre(evento.getNombre());
            actualizar.setFecha_inicio(evento.getFecha_inicio());
            actualizar.setFecha_fin(evento.getFecha_fin());
            actualizar.setDescripcion(evento.getDescripcion());
            actualizar.setInversion(evento.getInversion());
            actualizar.setCosto(evento.getCosto());

            eventoService.Guardar(actualizar);
          
        }
    } 
    
    /* @DeleteMapping(path = "/delete/{idE}")
    public void Eliminar (@PathVariable("idE") Integer idE)
    {
        if (eventoService.Existe(idE))
        {
            eventoService.Eliminar(idE);
        }
    } */
}





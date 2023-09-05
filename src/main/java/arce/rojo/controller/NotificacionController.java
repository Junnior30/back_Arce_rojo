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
import arce.rojo.model.Notificacion;
import arce.rojo.service.NotificacionService;
@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
    @Autowired
    NotificacionService notificacionService;
    
    @GetMapping(path = "/list")
    public List<Notificacion> Listar ()
    {
        return notificacionService.Listar();
    }
    
    @GetMapping(path = "/search/{idN}")
    public Notificacion Buscar (@PathVariable Integer idN)
    {
        if (!notificacionService.Existe(idN)) {}
        return notificacionService.Buscar(idN).get();
    }
    
    @PostMapping(path = "/create")
    public Notificacion Registrar (@RequestBody Notificacion notificacion)
    {
        return notificacionService.Guardar(notificacion);
    }
    
    @PutMapping("/update/{idN}")
    public void Actualizar (@PathVariable Integer idN, @RequestBody Notificacion notificacion)
    {
        if (notificacionService.Existe(idN))
        {
          Notificacion actualizar = notificacionService.Buscar(idN).get();
            actualizar.setFecha(notificacion.getFecha());
            actualizar.setDetalle(notificacion.getDetalle());
            actualizar.setCodigo_clase(notificacion.getCodigo_clase());
            notificacionService.Guardar(actualizar);
        }
    } 
    
    @DeleteMapping(path = "/delete/{idN}")
    public void Eliminar (@PathVariable Integer idN)
    {
        if (notificacionService.Existe(idN))
        {
            notificacionService.Eliminar(idN);
        }
    }
}





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
import arce.rojo.model.Detalle_Proyecto;
import arce.rojo.service.Detalle_ProyectoService;
@RestController
@RequestMapping("/detalle_Proyecto")
public class Detalle_ProyectoController {
    @Autowired
    Detalle_ProyectoService detalle_ProyectoService;
    
    @GetMapping(path = "/list")
    public List<Detalle_Proyecto> Listar ()
    {
        return detalle_ProyectoService.Listar();
    }
    
    @GetMapping(path = "/search/{idDP}")
    public Detalle_Proyecto Buscar (@PathVariable Integer idDP)
    {
        if (!detalle_ProyectoService.Existe(idDP)) {}
        return detalle_ProyectoService.Buscar(idDP).get();
    }
    
    @PostMapping(path = "/create")
    public Detalle_Proyecto Registrar (@RequestBody Detalle_Proyecto detalle_Proyecto)
    {
        return detalle_ProyectoService.Guardar(detalle_Proyecto);
    }
    
 /*    @PutMapping("/update/{idDP}")
    public void Actualizar (@PathVariable("idDP") Integer idDP, @RequestBody Detalle_Proyecto detalle_Proyecto)
    {
        if (detalle_ProyectoService.Existe(idDP))
        {
          Detalle_Proyecto actualizar = detalle_ProyectoService.Buscar(idDP).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            detalle_ProyectoService.Guardar(actualizar);
          
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




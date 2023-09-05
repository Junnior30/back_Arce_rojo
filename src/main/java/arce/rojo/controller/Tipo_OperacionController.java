package arce.rojo.controller;
// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Tipo_Operacion;
import arce.rojo.service.Tipo_OperacionService;
@RestController
@RequestMapping("/tipo_Operacion")
public class Tipo_OperacionController {
    @Autowired
    Tipo_OperacionService tipo_OperacionService;
    
   /*  @GetMapping(path = "/list")
    public List<Tipo_Operacion> Listar ()
    {
        return tipo_OperacionService.Listar();
    }
    
    @GetMapping(path = "/search/{iTO}")
    public Tipo_Operacion Buscar (@PathVariable("iTO") Integer iTO)
    {
        if (!tipo_OperacionService.Existe(iTO)) {}
        return tipo_OperacionService.Buscar(iTO).get();
    } */
    
    @PostMapping(path = "/create")
    public Tipo_Operacion Registrar (@RequestBody Tipo_Operacion tipo_Operacion)
    {
        return tipo_OperacionService.Guardar(tipo_Operacion);
    }
    
 /*    @PutMapping("/update/{iTO}")
    public void Actualizar (@PathVariable("iTO") Integer iTO, @RequestBody Tipo_Operacion tipo_Operacion)
    {
        if (tipo_OperacionService.Existe(iTO))
        {
          Tipo_Operacion actualizar = tipo_OperacionService.Buscar(iTO).get();
            actualizar.setNombre(tipo_Operacion.getNombre());
            // actualizar.setSueldo(certificado.getSueldo());
            tipo_OperacionService.Guardar(actualizar);
          
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






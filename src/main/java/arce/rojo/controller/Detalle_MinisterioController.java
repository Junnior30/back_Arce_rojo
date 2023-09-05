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
import arce.rojo.model.Detalle_Ministerio;
import arce.rojo.service.Detalle_MinisterioService;
@RestController
@RequestMapping("/detalle_Ministerio")
public class Detalle_MinisterioController {
    @Autowired
    Detalle_MinisterioService detalle_MinisterioService;
    
    @GetMapping(path = "/list")
    public List<Detalle_Ministerio> Listar ()
    {
        return detalle_MinisterioService.Listar();
    }
    
    @GetMapping(path = "/search/{idDM}")
    public Detalle_Ministerio Buscar (@PathVariable Integer idDM)
    {
        if (!detalle_MinisterioService.Existe(idDM)) {}
        return detalle_MinisterioService.Buscar(idDM).get();
    }
    
    @PostMapping(path = "/create")
    public Detalle_Ministerio Registrar (@RequestBody Detalle_Ministerio detalle_Ministerio)
    {
        return detalle_MinisterioService.Guardar(detalle_Ministerio);
    }
    
   /*  @PutMapping("/update/{idDM}")
    public void Actualizar (@PathVariable("idDM") Integer idDM, @RequestBody Detalle_Ministerio detalle_Ministerio)
    {
        if (detalle_MinisterioService.Existe(idDM))
        {
          Detalle_Ministerio actualizar = detalle_MinisterioService.Buscar(idDM).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            detalle_MinisterioService.Guardar(actualizar);
          
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



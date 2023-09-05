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
import arce.rojo.model.Detalle_Compra;
import arce.rojo.service.Detalle_CompraService;
@RestController
@RequestMapping("/detalle_Compra")
public class Detalle_CompraController {
    @Autowired
    Detalle_CompraService detalle_CompraService;
    
    @GetMapping(path = "/list")
    public List<Detalle_Compra> Listar ()
    {
        return detalle_CompraService.Listar();
    }
    
    @GetMapping(path = "/search/{idDC}")
    public Detalle_Compra Buscar (@PathVariable Integer idDC)
    {
        if (!detalle_CompraService.Existe(idDC)) {}
        return detalle_CompraService.Buscar(idDC).get();
    }
    
    @PostMapping(path = "/create")
    public Detalle_Compra Registrar (@RequestBody Detalle_Compra detalle_Compra)
    {
        return detalle_CompraService.Guardar(detalle_Compra);
    }
    
   /*  @PutMapping("/update/{idDC}")
    public void Actualizar (@PathVariable("idDC") Integer idDC, @RequestBody Detalle_Compra detalle_Compra)
    {
        if (detalle_CompraService.Existe(idDC))
        {
          Detalle_Compra actualizar = detalle_CompraService.Buscar(idDC).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            detalle_CompraService.Guardar(actualizar);
          
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


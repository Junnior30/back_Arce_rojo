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
import arce.rojo.model.Detalle_Empleado;
import arce.rojo.service.Detalle_EmpleadoService;
@RestController
@RequestMapping("/detalle_Empleado")
public class Detalle_EmpleadoController {
    @Autowired
    Detalle_EmpleadoService detalle_EmpleadoService;
    
    @GetMapping(path = "/list")
    public List<Detalle_Empleado> Listar ()
    {
        return detalle_EmpleadoService.Listar();
    }
    
    @GetMapping(path = "/search/{idDC}")
    public Detalle_Empleado Buscar (@PathVariable Integer idDC)
    {
        if (!detalle_EmpleadoService.Existe(idDC)) {}
        return detalle_EmpleadoService.Buscar(idDC).get();
    }
    
    @PostMapping(path = "/create")
    public Detalle_Empleado Registrar (@RequestBody Detalle_Empleado detalle_Empleado)
    {
        return detalle_EmpleadoService.Guardar(detalle_Empleado);
    }
    
 /*    @PutMapping("/update/{idDC}")
    public void Actualizar (@PathVariable("idDC") Integer idDC, @RequestBody Detalle_Empleado detalle_Empleado)
    {
        if (detalle_EmpleadoService.Existe(idDC))
        {
          Detalle_Empleado actualizar = detalle_EmpleadoService.Buscar(idDC).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            detalle_EmpleadoService.Guardar(actualizar);
          
        }
    } 
     */
    /* @DeleteMapping(path = "/delete/{idCAL}")
    public void Eliminar (@PathVariable("idCAL") Integer idCAL)
    {
        if (calificacionService.Existe(idCAL))
        {
          calificacionService.Eliminar(idCAL);
        }
    } */
}


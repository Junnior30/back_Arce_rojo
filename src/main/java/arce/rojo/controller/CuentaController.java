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
import arce.rojo.model.Cuenta;
import arce.rojo.service.CuentaService;
@RestController
@RequestMapping("/cuenta")
public class CuentaController {
    @Autowired
    CuentaService cuentaService;
    
    @GetMapping(path = "/list")
    public List<Cuenta> Listar ()
    {
        return cuentaService.Listar();
    }
    
    @GetMapping(path = "/search/{idCUENTA}")
    public Cuenta Buscar (@PathVariable Integer idCUENTA)
    {
        if (!cuentaService.Existe(idCUENTA)) {}
        return cuentaService.Buscar(idCUENTA).get();
    }
    
    @PostMapping(path = "/create")
    public Cuenta Registrar (@RequestBody Cuenta cuenta)
    {
        return cuentaService.Guardar(cuenta);
    }
    
    @PutMapping("/update/{idCO}")
    public void Actualizar (@PathVariable Integer idCUENTA, @RequestBody Cuenta cuenta)
    {
        if (cuentaService.Existe(idCUENTA))
        {
          Cuenta actualizar = cuentaService.Buscar(idCUENTA).get();
            actualizar.setNombre(cuenta.getNombre());
            actualizar.setNumero_cuenta(cuenta.getNumero_cuenta());
            actualizar.setDescripcion(cuenta.getDescripcion());
            cuentaService.Guardar(actualizar);
          
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

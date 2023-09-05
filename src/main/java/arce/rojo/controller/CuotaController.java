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
import arce.rojo.model.Cuota;
import arce.rojo.service.CuotaService;
@RestController
@RequestMapping("/cuota")
public class CuotaController {
    @Autowired
    CuotaService cuotaService;
    
    @GetMapping(path = "/list")
    public List<Cuota> Listar ()
    {
        return cuotaService.Listar();
    }
    
    @GetMapping(path = "/search/{idC}")
    public Cuota Buscar (@PathVariable Integer idC)
    {
        if (!cuotaService.Existe(idC)) {}
        return cuotaService.Buscar(idC).get();
    }
    
    @PostMapping(path = "/create")
    public Cuota Registrar (@RequestBody Cuota cuota)
    {
        return cuotaService.Guardar(cuota);
    }
    
    @PutMapping("/update/{idC}")
    public void Actualizar (@PathVariable Integer idC, @RequestBody Cuota cuota)
    {
        if (cuotaService.Existe(idC))
        {
          Cuota actualizar = cuotaService.Buscar(idC).get();
            actualizar.setEstado(cuota.isEstado());
            // actualizar.setSueldo(certificado.getSueldo());
            cuotaService.Guardar(actualizar);
          
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

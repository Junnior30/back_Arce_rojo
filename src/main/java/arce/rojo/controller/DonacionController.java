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
import arce.rojo.model.Donacion;
import arce.rojo.service.DonacionService;
@RestController
@RequestMapping("/donacion")
public class DonacionController {
    @Autowired
    DonacionService donacionService;
    
    @GetMapping(path = "/list")
    public List<Donacion> Listar ()
    {
        return donacionService.Listar();
    }
    
    @GetMapping(path = "/search/{idDO}")
    public Donacion Buscar (@PathVariable Integer idDO)
    {
        if (!donacionService.Existe(idDO)) {}
        return donacionService.Buscar(idDO).get();
    }
    
    @PostMapping(path = "/create")
    public Donacion Registrar (@RequestBody Donacion donacion)
    {
        return donacionService.Guardar(donacion);
    }
    
 /*    @PutMapping("/update/{idDO}")
    public void Actualizar (@PathVariable("idDO") Integer idDO, @RequestBody Donacion donacion)
    {
        if (donacionService.Existe(idDO))
        {
          Donacion actualizar = donacionService.Buscar(idDO).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            // actualizar.setSueldo(certificado.getSueldo());
            donacionService.Guardar(actualizar);
          
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





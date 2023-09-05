  package arce.rojo.controller;

  import java.util.List;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//   import org.springframework.web.bind.annotation.DeleteMapping;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.PostMapping;
//   import org.springframework.web.bind.annotation.PutMapping;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RestController;

  import arce.rojo.model.Distrito;
  import arce.rojo.service.DistritoService;
 @RestController
 @RequestMapping("/distrito")
 @CrossOrigin(origins = "http://localhost:4200")
  public class DistritoController {
    @Autowired
     DistritoService distritoService;
     
     @GetMapping(path = "/list")
     public List<Distrito> Listar ()
     {
         return distritoService.Listar();
     }
     
     @GetMapping(path = "/search/{idD}")
     public Distrito Buscar (@PathVariable Integer idD)
     {
         if (!distritoService.Existe(idD)) {}
         return distritoService.Buscar(idD).get();
     }
     
     @PostMapping(path = "/create")
     public Distrito Registrar (@RequestBody Distrito distrito)
     {
         return distritoService.Guardar(distrito);
     }
     
     /* @PutMapping("/update/{idD}")
     public void Actualizar (@PathVariable("idD") Integer idD, @RequestBody Distrito distrito)
     {
         if (distritoService.Existe(idD))
         {
             Distrito actualizar = distritoService.Buscar(idD).get();
             actualizar.setNombre(distrito.getNombre());
             actualizar.setLatitud(distrito.getLatitud());
             actualizar.setLongitud(distrito.getLongitud());
             distritoService.Guardar(actualizar);
         }
     } */
     
     /* @DeleteMapping(path = "/delete/{idD}")
     public void Eliminar (@PathVariable("idD") Integer idD)
     {
         if (distritoService.Existe(idD))
         {
             distritoService.Eliminar(idD);
         }
     } */
    
  }

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
 import arce.rojo.model.Estudiante;
 import arce.rojo.service.EstudianteService;
 
 @RestController
 @RequestMapping("/estudiante")
 public class EstudianteController {
     @Autowired
     EstudianteService estudianteService;
     
     @GetMapping(path = "/list")
     public List<Estudiante> Listar ()
     {
         return estudianteService.Listar();
     }
     
     @GetMapping(path = "/search/{codigo}")
     public Estudiante Buscar (@PathVariable Integer codigo)
     {
         if (!estudianteService.Existe(codigo)) {}
         return estudianteService.Buscar(codigo).get();
     }
     
     @PostMapping(path = "/create")
     public Estudiante Registrar (@RequestBody Estudiante estudiante)
     {
         return estudianteService.Guardar(estudiante);
     }
     
     @PutMapping("/update/{codigo}")
     public void Actualizar (@PathVariable Integer codigo, @RequestBody Estudiante estudiante)
     {
         if (estudianteService.Existe(codigo))
         {
             Estudiante actualizar = estudianteService.Buscar(codigo).get();
             actualizar.setNombre(estudiante.getNombre());
             estudianteService.Guardar(actualizar);
         }
     }
     
     @DeleteMapping(path = "/delete/{codigo}")
     public void Eliminar (@PathVariable Integer codigo)
     {
         if (estudianteService.Existe(codigo))
         {
             estudianteService.Eliminar(codigo);
         }
     }
 }
package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Empleado;
import arce.rojo.service.EmpleadoService;
@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;
    
    @GetMapping(path = "/list")
    public List<Empleado> Listar ()
    {
        return empleadoService.Listar();
    }
    
    @GetMapping(path = "/search/{idEMP}")
    public Empleado Buscar (@PathVariable Integer idEMP)
    {
        if (!empleadoService.Existe(idEMP)) {}
        return empleadoService.Buscar(idEMP).get();
    }
    
    @PostMapping(path = "/create")
    public Empleado Registrar (@RequestBody Empleado empleado)
    {
        return empleadoService.Guardar(empleado);
    }
    
    @PutMapping("/update/{idEMP}")
    public void Actualizar (@PathVariable Integer idEMP, @RequestBody Empleado empleado)
    {
        if (empleadoService.Existe(idEMP))
        {
          Empleado actualizar = empleadoService.Buscar(idEMP).get();
            actualizar.setNombre(empleado.getNombre());
            actualizar.setApellido(empleado.getApellido());
            actualizar.setIdentificacion(empleado.getIdentificacion());
            actualizar.setTelefono(empleado.getTelefono());
            actualizar.setCorreo(empleado.getCorreo());
            actualizar.setCodigo_cargo(empleado.getCodigo_cargo());
            empleadoService.Guardar(actualizar);
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





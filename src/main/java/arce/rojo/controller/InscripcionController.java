package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Inscripcion;
import arce.rojo.service.InscripcionService;
@RestController
@RequestMapping("/inscripcion")
@CrossOrigin(origins = "http://localhost:4200")
public class InscripcionController {
    @Autowired
    InscripcionService inscripcionService;
    @GetMapping(path = "/list")
    public List<Inscripcion> Listar ()
    {
        return inscripcionService.Listar();
    }
    @GetMapping(path = "/search/{idI}")
    public Inscripcion Buscar (@PathVariable Integer idI)
    {
        if (!inscripcionService.Existe(idI)) {}
        return inscripcionService.Buscar(idI).get();
    }
    @PostMapping(path = "/create")
    public Inscripcion Registrar (@RequestBody Inscripcion inscripcion)
    {
        return inscripcionService.Guardar(inscripcion);
    }
    @PutMapping("/update/{idI}")
    public void Actualizar (@PathVariable Integer idI, @RequestBody Inscripcion inscripcion)
    {
        if (inscripcionService.Existe(idI))
        {
            Inscripcion actualizar = inscripcionService.Buscar(idI).get();
            actualizar.setEstado(inscripcion.isEstado());
            actualizar.setCosto(inscripcion.getCosto());
            actualizar.setCodigo_alumno(inscripcion.getCodigo_alumno());
            actualizar.setCodigo_proyecto(inscripcion.getCodigo_proyecto());
            inscripcionService.Guardar(actualizar);
        }
    }
    @DeleteMapping(path = "/delete/{idI}")
    public void Eliminar (@PathVariable Integer idI)
    {
        if (inscripcionService.Existe(idI))
        {
            inscripcionService.Eliminar(idI);
        }
    }
}





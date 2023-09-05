package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Alumno;
import arce.rojo.service.AlumnoService;
@RestController
@RequestMapping("/alumno")
@CrossOrigin(origins = "http://localhost:4200")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping(path = "/list")
    public List<Alumno> Listar ()
    {
        return alumnoService.Listar();
    }
    
    @GetMapping(path = "/search/{idA}")
    public Alumno Buscar (@PathVariable Integer idA)
    {
        if (!alumnoService.Existe(idA)) {}
        return alumnoService.Buscar(idA).get();
    }
    
    @PostMapping(path = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno Registrar (@RequestBody Alumno alumno)
    {
        return alumnoService.Guardar(alumno);
    }
    
    @PutMapping("/update/{idA}")
    public void Actualizar (@PathVariable Integer idA, @RequestBody Alumno alumno)
    {
        if (alumnoService.Existe(idA))
        {
            Alumno actualizar = alumnoService.Buscar(idA).get();
            actualizar.setNombre(alumno.getNombre());
            actualizar.setApellidoPat(alumno.getApellidoPat());
            actualizar.setApellidoMat(alumno.getApellidoMat());
            actualizar.setFechaN(alumno.getFechaN());
            actualizar.setGenero(alumno.isGenero());
            actualizar.setIdentificacion(alumno.getIdentificacion());
            actualizar.setColegio(alumno.getColegio());
            actualizar.setCodigo_distrito(alumno.getCodigo_distrito());
            actualizar.setCodigo_representante(alumno.getCodigo_representante());
           // actualizar.setInscripcion(alumno.getInscripcion());
            alumnoService.Guardar(actualizar);
        }
    }
    
    @DeleteMapping(path = "/delete/{idA}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void Eliminar (@PathVariable Integer idA)
    {
        if (alumnoService.Existe(idA))
        {
            alumnoService.Eliminar(idA);
        }
    }
}
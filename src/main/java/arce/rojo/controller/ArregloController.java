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
import arce.rojo.model.Arreglo;
import arce.rojo.service.ArregloService;
@RestController
@RequestMapping("/arreglo")
public class ArregloController {
    @Autowired
    ArregloService arregloService;
    
    @GetMapping(path = "/list")
    public List<Arreglo> Listar ()
    {
        return arregloService.Listar();
    }
    
    @GetMapping(path = "/search/{idAR}")
    public Arreglo Buscar (@PathVariable Integer idAR)
    {
        if (!arregloService.Existe(idAR)) {}
        return arregloService.Buscar(idAR).get();
    }
    
    @PostMapping(path = "/create")
    public Arreglo Registrar (@RequestBody Arreglo arreglo)
    {
        return arregloService.Guardar(arreglo);
    }
    
    @PutMapping("/update/{idAR}")
    public void Actualizar (@PathVariable Integer idAR, @RequestBody Arreglo arreglo)
    {
        if (arregloService.Existe(idAR))
        {
          Arreglo actualizar = arregloService.Buscar(idAR).get();
            actualizar.setNombre(arreglo.getNombre());
            actualizar.setAutor(arreglo.getAutor());
            actualizar.setTono(arreglo.getTono());
            actualizar.setCodigo_material(arreglo.getCodigo_material());
            actualizar.setCodigo_genero(arreglo.getCodigo_genero());
            arregloService.Guardar(actualizar);
        }
    }
    
    @DeleteMapping(path = "/delete/{idAR}")
    public void Eliminar (@PathVariable Integer idAR)
    {
        if (arregloService.Existe(idAR))
        {
          arregloService.Eliminar(idAR);
        }
    }
}
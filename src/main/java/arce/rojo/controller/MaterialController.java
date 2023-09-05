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
import arce.rojo.model.Material;
import arce.rojo.service.MaterialService;
@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    MaterialService materialService;
    
    @GetMapping(path = "/list")
    public List<Material> Listar ()
    {
        return materialService.Listar();
    }
    
    @GetMapping(path = "/search/{idMA}")
    public Material Buscar (@PathVariable Integer idMA)
    {
        if (!materialService.Existe(idMA)) {}
        return materialService.Buscar(idMA).get();
    }
    
    @PostMapping(path = "/create")
    public Material Registrar (@RequestBody Material material)
    {
        return materialService.Guardar(material);
    }
    
    @PutMapping("/update/{idMA}")
    public void Actualizar (@PathVariable Integer idMA, @RequestBody Material material)
    {
        if (materialService.Existe(idMA))
        {
          Material actualizar = materialService.Buscar(idMA).get();
            actualizar.setNombre(material.getNombre());
            actualizar.setDescripcion(material.getDescripcion());
            actualizar.setCodigo_evento(material.getCodigo_evento());
            materialService.Guardar(actualizar);
        }
    } 
    
    @DeleteMapping(path = "/delete/{idMA}")
    public void Eliminar (@PathVariable Integer idMA)
    {
        if (materialService.Existe(idMA))
        {
            materialService.Eliminar(idMA);
        }
    }
}





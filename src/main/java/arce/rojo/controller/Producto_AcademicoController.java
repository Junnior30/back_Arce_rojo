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
import arce.rojo.model.Producto_Academico;
import arce.rojo.service.Producto_AcademicoService;
@RestController
@RequestMapping("/producto_Academico")
public class Producto_AcademicoController {
    @Autowired
    Producto_AcademicoService producto_AcademicoService;
    
    @GetMapping(path = "/list")
    public List<Producto_Academico> Listar ()
    {
        return producto_AcademicoService.Listar();
    }
    
    @GetMapping(path = "/search/{idPA}")
    public Producto_Academico Buscar (@PathVariable Integer idPA)
    {
        if (!producto_AcademicoService.Existe(idPA)) {}
        return producto_AcademicoService.Buscar(idPA).get();
    }
    
    @PostMapping(path = "/create")
    public Producto_Academico Registrar (@RequestBody Producto_Academico producto_Academico)
    {
        return producto_AcademicoService.Guardar(producto_Academico);
    }
    
    @PutMapping("/update/{idPA}")
    public void Actualizar (@PathVariable Integer idPA, @RequestBody Producto_Academico producto_Academico)
    {
        if (producto_AcademicoService.Existe(idPA))
        {
          Producto_Academico actualizar = producto_AcademicoService.Buscar(idPA).get();
            actualizar.setFecha(producto_Academico.getFecha());
            actualizar.setDescripcion(producto_Academico.getDescripcion());
            actualizar.setPeso(producto_Academico.getPeso());
            producto_AcademicoService.Guardar(actualizar);
          
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





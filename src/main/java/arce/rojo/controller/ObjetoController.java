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
import arce.rojo.model.Objeto;
import arce.rojo.service.ObjetoService;
@RestController
@RequestMapping("/objeto")
public class ObjetoController {
    @Autowired
    ObjetoService objetoService;
    
    @GetMapping(path = "/list")
    public List<Objeto> Listar ()
    {
        return objetoService.Listar();
    }
    
    @GetMapping(path = "/search/{idOB}")
    public Objeto Buscar (@PathVariable Integer idOB)
    {
        if (!objetoService.Existe(idOB)) {}
        return objetoService.Buscar(idOB).get();
    }
    
    @PostMapping(path = "/create")
    public Objeto Registrar (@RequestBody Objeto objeto)
    {
        return objetoService.Guardar(objeto);
    }
    
    /* @PutMapping("/update/{idOB}")
    public void Actualizar (@PathVariable("idOB") Integer idOB, @RequestBody Objeto objeto)
    {
        if (objetoService.Existe(idOB))
        {
          Objeto actualizar = objetoService.Buscar(idOB).get();
            // actualizar.setDescripcion(certificado.getDescripcion());
            actualizar.setObjeto(objeto.getObjeto());
            objetoService.Guardar(actualizar);
          
        }
    } 
     */
    /* @DeleteMapping(path = "/delete/{idCAL}")
    public void Eliminar (@PathVariable("idCAL") Integer idCAL)
    {
        if (calificacionService.Existe(idCAL))
        {
          calificacionService.Eliminar(idCAL);
        }
    } */
}





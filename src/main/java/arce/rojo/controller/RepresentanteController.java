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

import arce.rojo.model.Representante;
import arce.rojo.service.RepresentanteService;
@RestController
@RequestMapping("/representante")
@CrossOrigin(origins = "http://localhost:4200")
public class RepresentanteController {
    @Autowired
    RepresentanteService representanteService;
    
    @GetMapping(path = "/list")
    public List<Representante> Listar ()
    {
        return representanteService.Listar();
    }
    
     
    @GetMapping(path = "/search/{idR}")
    public Representante Buscar (@PathVariable Integer idR)
    {
        if (!representanteService.Existe(idR)) {}
        return representanteService.Buscar(idR).get();
    }
    
    @PostMapping(path = "/create")
    public Representante Registrar (@RequestBody Representante representante)
    {
        return representanteService.Guardar(representante);
    }
    
    @PutMapping("/update/{idR}")
    public void Actualizar (@PathVariable Integer idR, @RequestBody Representante representante)
    {
        if (representanteService.Existe(idR))
        {
          Representante actualizar = representanteService.Buscar(idR).get();
            actualizar.setNombres(representante.getNombres());
            actualizar.setApellidos(representante.getApellidos());
            actualizar.setIdentificacion(representante.getIdentificacion());
            actualizar.setTelefono(representante.getTelefono());
            actualizar.setDireccion(representante.getDireccion());
            actualizar.setCorreo(representante.getCorreo());
            representanteService.Guardar(actualizar);
          
        }
    } 
    @DeleteMapping(path = "/delete/{idR}")
    public void Eliminar (@PathVariable Integer idR)
    {
        if (representanteService.Existe(idR))
        {
            representanteService.Eliminar(idR);
        }
    }
}






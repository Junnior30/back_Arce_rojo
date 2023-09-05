/* package arce.rojo.controller;
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
import arce.rojo.model.Usuario;
import arce.rojo.service.UsuarioService;
@RestController
@RequestMapping("/representante")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping(path = "/list")
    public List<Usuario> Listar ()
    {
        return usuarioService.Listar();
    }
    
    @GetMapping(path = "/search/{idU}")
    public Usuario Buscar (@PathVariable("idU") Integer idU)
    {
        if (!usuarioService.Existe(idU)) {}
        return usuarioService.Buscar(idU).get();
    }
    
    @PostMapping(path = "/create")
    public Usuario Registrar (@RequestBody Usuario usuario)
    {
        return usuarioService.Guardar(usuario);
    }
    
    @PutMapping("/update/{idU}")
    public void Actualizar (@PathVariable("idU") Integer idU, @RequestBody Usuario usuario)
    {
        if (usuarioService.Existe(idU))
        {
          Usuario actualizar = usuarioService.Buscar(idU).get();
            actualizar.setPass(usuario.getPass());
            usuarioService.Guardar(actualizar);
          
        }
    } 
    
    @DeleteMapping(path = "/delete/{idU}")
    public void Eliminar (@PathVariable("idCAL") Integer idU)
    {
        if (usuarioService.Existe(idU))
        {
            usuarioService.Eliminar(idU);
        }
    }
} */






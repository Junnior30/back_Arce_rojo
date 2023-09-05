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
import arce.rojo.model.Cliente;
import arce.rojo.service.ClienteService;
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    
    @GetMapping(path = "/list")
    public List<Cliente> Listar ()
    {
        return clienteService.Listar();
    }
    
    @GetMapping(path = "/search/{idCLI}")
    public Cliente Buscar (@PathVariable Integer idCLI)
    {
        if (!clienteService.Existe(idCLI)) {}
        return clienteService.Buscar(idCLI).get();
    }
    
    @PostMapping(path = "/create")
    public Cliente Registrar (@RequestBody Cliente cliente)
    {
        return clienteService.Guardar(cliente);
    }
    
    @PutMapping("/update/{idCLI}")
    public void Actualizar (@PathVariable Integer idCLI, @RequestBody Cliente cliente)
    {
        if (clienteService.Existe(idCLI))
        {
          Cliente actualizar = clienteService.Buscar(idCLI).get();
            actualizar.setNombre(cliente.getNombre());
            actualizar.setIdentificacion(cliente.getIdentificacion());
            actualizar.setCorreo(cliente.getCorreo());
            actualizar.setTelefono(cliente.getTelefono());
            clienteService.Guardar(actualizar);
          
        }
    } 
    
    /* @DeleteMapping(path = "/delete/{idCLI}")
    public void Eliminar (@PathVariable("idCLI") Integer idCLI)
    {
        if (clienteService.Existe(idCLI))
        {
            clienteService.Eliminar(idCLI);
        }
    } */
}

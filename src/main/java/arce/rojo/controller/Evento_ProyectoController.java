/* package arce.rojo.controller;
// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Evento_Proyecto;
import arce.rojo.service.Evento_ProyectoService;
@RestController
@RequestMapping("/evento_Proyecto")
public class Evento_ProyectoController {
    @Autowired
    Evento_ProyectoService evento_ProyectoService;
    @PostMapping(path = "/create")
    public Evento_Proyecto Registrar (@RequestBody Evento_Proyecto evento_Proyecto)
    {
        return evento_ProyectoService.Guardar(evento_Proyecto);
    }
} */





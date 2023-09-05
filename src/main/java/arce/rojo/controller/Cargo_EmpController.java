package arce.rojo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import arce.rojo.model.Cargo_Emp;
import arce.rojo.service.Cargo_EmpService;
@RestController
@RequestMapping("/cargo_emp")
@CrossOrigin(origins = "http://localhost:4200")
public class Cargo_EmpController {
    @Autowired
    Cargo_EmpService cargo_EmpService;
    
    @GetMapping(path = "/list")
    public List<Cargo_Emp> Listar ()
    {
        return cargo_EmpService.Listar();
    }
    
    @GetMapping(path = "/search/{idCARG}")
    public Cargo_Emp Buscar (@PathVariable Integer idCARG)
    {
        if (!cargo_EmpService.Existe(idCARG)) {}
        return cargo_EmpService.Buscar(idCARG).get();
    }
    
    @PostMapping(path = "/create")
    public Cargo_Emp Registrar (@RequestBody Cargo_Emp cargo_Emp)
    {
        return cargo_EmpService.Guardar(cargo_Emp);
    }
    
    @PutMapping("/update/{idCARG}")
    public void Actualizar (@PathVariable Integer idCARG, @RequestBody Cargo_Emp cargo_Emp)
    {
        if (cargo_EmpService.Existe(idCARG))
        {
          Cargo_Emp actualizar = cargo_EmpService.Buscar(idCARG).get();
             actualizar.setNombre(cargo_Emp.getNombre());
            actualizar.setDescripcion(cargo_Emp.getDescripcion());
            actualizar.setSueldo(cargo_Emp.getSueldo());
            cargo_EmpService.Guardar(actualizar);
          
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

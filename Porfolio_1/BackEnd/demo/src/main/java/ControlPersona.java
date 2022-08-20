
import com.portfolio2.alan.demo.entidad.Persona;
import com.portfolio2.alan.demo.interfas.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alan
 */
@RestController
public class ControlPersona {
    @Autowired IPersonaServicio ipersonaServicio;
    
    @GetMapping ("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaServicio.getPersona();
    }
    
    @PostMapping ("/persona/crear")
    public String createPersona (@RequestBody Persona persona){
        ipersonaServicio.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping ("/persona/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
    ipersonaServicio.deletePersona(id);
    return "La persona fue eliminada correctamente";
    }
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                           @RequestParam("nombre") String nuevoNombre,
                           @RequestParam("apellido") String nuevoApellido,
                           @RequestParam("img") String nuevoImg){
        Persona persona = ipersonaServicio.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        ipersonaServicio.savePersona(persona);
        return persona;
    }
}   


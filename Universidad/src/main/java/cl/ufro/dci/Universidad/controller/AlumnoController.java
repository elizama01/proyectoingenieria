package cl.ufro.dci.Universidad.controller;

import cl.ufro.dci.Universidad.modelo.Alumno;
import cl.ufro.dci.Universidad.modelo.Asignatura;
import cl.ufro.dci.Universidad.modelo.Universidad;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping(value="/alumnos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AlumnoController {

    private Universidad universidad = Universidad.getInstance();
    private Asignatura duenio;
    @RequestMapping(value="/{asignatura}",method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Alumno> getIndex(@PathVariable("asignatura") String codigo){
        System.out.println("asignatura :"+codigo);
        for (Asignatura usr : universidad.getAsignaturas()){
            if (usr.getCodigo().equals(codigo)){
                duenio=usr;
            }
        }
        return duenio.getAlumnos();
    }

    @RequestMapping(value = "/{codigo}",method = RequestMethod.POST, produces = "application/json")
    public String postIndex(@RequestBody Alumno alumno, @PathVariable String codigo){
        System.out.println("alumno: "+alumno);
        duenio.addAlumnos(alumno);
        return "status:200";
    }
}

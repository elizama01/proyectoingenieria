package cl.ufro.dci.Universidad.controller;

import cl.ufro.dci.Universidad.modelo.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/profesores")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ProfesorController {
    private Universidad universidad = Universidad.getInstance();
    private Asignatura duenio;
    @RequestMapping(value="/{asignatura}",method = RequestMethod.GET, produces = "application/json")
    public List<Profesor> getIndex(@PathVariable("asignatura") String codigo){
        System.out.println("asignatura :"+codigo);
        for (Asignatura usr : universidad.getAsignaturas()){
            if (usr.getCodigo().equals(codigo)){
                duenio=usr;
            }
        }
        return duenio.getProfesores();
    }

    @RequestMapping(value = "/{codigo}",method = RequestMethod.POST, produces = "application/json")
    public String postIndex(@RequestBody Profesor profesor, @PathVariable String codigo){
        System.out.println("profesor: "+profesor);
        duenio.addProfesores(profesor);
        return "status:200";
    }

}

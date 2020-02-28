package cl.ufro.dci.Universidad.controller;

import cl.ufro.dci.Universidad.modelo.Asignatura;
import cl.ufro.dci.Universidad.modelo.Universidad;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value="/asignaturas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AsigController {
    private Universidad universidad= Universidad.getInstance();

    @RequestMapping(value="/",method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Asignatura> getIndex(){
        return universidad.getAsignaturas();
    }


    @RequestMapping(value = "/",method = RequestMethod.POST, produces = "application/json")
    public String postIndex( @RequestBody Asignatura asignatura){
        universidad.addAsignatura(asignatura);
        return "status:200";
    }
}
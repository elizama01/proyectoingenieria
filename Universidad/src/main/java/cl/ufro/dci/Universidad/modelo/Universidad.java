package cl.ufro.dci.Universidad.modelo;

import java.util.ArrayList;

public class Universidad {
    private static Universidad universidad;

    public static Universidad getInstance(){
        if (universidad == null){
            universidad = new Universidad();
        }
        return universidad;
    }

    private ArrayList<Asignatura> asignaturas;

    private Universidad() {
        this.asignaturas = new ArrayList<>();
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void addAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }

}

package cl.ufro.dci.Universidad.modelo;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private String codigo;
    private String nomDpto;
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;

    public Asignatura() {
        profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomDpto() {
        return nomDpto;
    }

    public void setNomDpto(String nomDpto) {
        this.nomDpto = nomDpto;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesores(Profesor profesores) {
        this.profesores.add(profesores);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void addAlumnos(Alumno alumnos) {
        this.alumnos.add(alumnos);
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nomDpto='" + nomDpto + '\'' +
                ", profesores=" + profesores +
                ", alumnos=" + alumnos +
                '}';
    }
}

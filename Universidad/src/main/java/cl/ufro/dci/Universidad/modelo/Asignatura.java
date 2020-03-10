package cl.ufro.dci.Universidad.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ASIGNATURA")
public class Asignatura {
   @Id
   private String codigo;
@Column(name = "NOMBRE")
   private String nombre;
@Column(name = "NomDpto")
    private String nomDpto;
@OneToMany
    private List<Profesor> profesores;
@OneToMany
    private List<Alumno> alumnos;

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

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesores(Profesor profesores) {
        this.profesores.add(profesores);
    }

    public List<Alumno> getAlumnos() {
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

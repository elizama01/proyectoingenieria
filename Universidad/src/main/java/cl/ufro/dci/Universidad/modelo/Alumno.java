package cl.ufro.dci.Universidad.modelo;

import javax.persistence.*;

@Entity
@Table(name = "ALUMNO")
public class Alumno {

    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "rut")
    private String rut;
    @Id
    private int id_alum;
@ManyToOne
@JoinColumn(name = "AsignaturaId",nullable = false)
private Asignatura asignatura;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getId_alum() {
        return id_alum;
    }

    public void setId_alum(int id_alum) {
        this.id_alum = id_alum;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", id_alum=" + id_alum +
                '}';
    }
}

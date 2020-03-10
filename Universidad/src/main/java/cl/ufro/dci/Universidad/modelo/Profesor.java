package cl.ufro.dci.Universidad.modelo;

import javax.persistence.*;

@Entity
@Table(name = "PROFESOR")
public class Profesor {

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "RUT")
    private String rut;

    @Id
    private int id_prof;

    @ManyToOne
    @JoinColumn(name = "AsignaturaId",nullable = false)
    private Asignatura asignatura;

    public Profesor() {
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

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", id_prof=" + id_prof +
                '}';
    }
}

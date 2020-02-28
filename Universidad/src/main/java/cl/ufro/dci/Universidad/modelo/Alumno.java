package cl.ufro.dci.Universidad.modelo;

public class Alumno {

    private String nombre;
    private String rut;
    private int id_alum;

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

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", id_alum=" + id_alum +
                '}';
    }
}

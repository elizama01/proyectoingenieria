package cl.ufro.dci.Universidad.modelo;

public class Profesor {
    private String nombre;
    private String rut;
    private int id_prof;

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

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", id_prof=" + id_prof +
                '}';
    }
}

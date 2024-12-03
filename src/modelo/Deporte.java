package modelo;

import java.util.Objects;

public class Deporte {
    private int id;

    private String nombre, tipo;

    public Deporte(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deporte deporte = (Deporte) o;
        return id == deporte.id && Objects.equals(nombre, deporte.nombre) && Objects.equals(tipo, deporte.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, tipo);
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

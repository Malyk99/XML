package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ListaDeportes {

    private ArrayList<Deporte> lista;

    public ListaDeportes() {
        this.lista = new ArrayList<Deporte>();
    }

    public ListaDeportes(ArrayList<Deporte> lista) {
        this.lista = lista;
    }

    public ArrayList<Deporte> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Deporte> lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaDeportes that = (ListaDeportes) o;
        return Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lista);
    }

    @Override
    public String toString() {
        return "ListaDeportes{" +
                "lista=" + lista +
                '}';
    }

    public void insertarDeporte(Deporte item){
        lista.add(item);
    }
    public int buscarNumeroDeporte(String deporte){;
        int n= 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.toString().indexOf(deporte)!=-1){
                n++;
            }
        }
        return n;
    }


}

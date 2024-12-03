import modelo.Deporte;
import modelo.ListaDeportes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ListaDeportes olimpiadas = new ListaDeportes();

        olimpiadas.insertarDeporte(new Deporte(1,"Rugby","Equipo"));
        olimpiadas.insertarDeporte(new Deporte(2,"Baloncesto","Equipo"));


        System.out.println(olimpiadas.toString());
        System.out.println(olimpiadas.buscarNumeroDeporte("Equipo"));
    }
}
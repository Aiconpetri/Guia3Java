package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import moldes.Pelicula;
import utilidades.UtilidadPeliculas;

public class ServicioPelicula {

    List<Pelicula> Peliculas = new ArrayList<>();
    ;
 Scanner read = new Scanner(System.in).useDelimiter("\n");
    ;
 UtilidadPeliculas up = new UtilidadPeliculas();

    public void crearPelicula() {
        String des;
        String titulo;
        String director;
        Double hora;
        System.out.println("Ingrese una pelicula");
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            titulo = read.next();
            System.out.println("Ingrese el director");
            director = read.next();
            System.out.println("Ingrese la duracion de la pelicula en horas");
            hora = read.nextDouble();
            Pelicula peli = new Pelicula(titulo, director, hora);
            Peliculas.add(peli);
            System.out.println("¿Desea crear otra pelicula?");
            des = read.next();
        } while (des.equalsIgnoreCase("Si"));
    }

    public void mostrarLista() {
        System.out.println("Se muestran todas las peliculas");
        for (int i = 0; i < Peliculas.size(); i++) {
            System.out.println(Peliculas.get(i));
        }
    }

    public void mostrarPeliLarga() {
        System.out.println("Se muestran todas las peliculas que duran mas de 1 hora");
        for (int i = 0; i < Peliculas.size(); i++) {
            if (Peliculas.get(i).getDuracion() >= 1) {
                System.out.println(Peliculas.get(i));
            }
        }
    }

    public void ordenarDuracionMayor() {
        System.out.println("Se muestran todas las peliculas ordenadas por mayor duracion");
        Collections.sort(Peliculas, up.duracionMayor);
        for (int i = 0; i < Peliculas.size(); i++) {
            System.out.println(Peliculas.get(i));
        }
    }

    public void ordenarDuracionMenor() {
        System.out.println("Se muestran todas las peliculas ordenadas por menor duracion");
        Collections.sort(Peliculas, up.duracionMenor);
        for (int i = 0; i < Peliculas.size(); i++) {
            System.out.println(Peliculas.get(i));
        }
    }
     public void ordenarTitulo() {
        System.out.println("Se muestran todas las peliculas ordenadas por titulo alfabeticamente");
        Collections.sort(Peliculas, up.ordenaTitulo);
        for (int i = 0; i < Peliculas.size(); i++) {
            System.out.println(Peliculas.get(i));
        }
    }
      public void ordenarDirector() {
        System.out.println("Se muestran todas las peliculas ordenadas por director alfabeticamente");
        Collections.sort(Peliculas, up.ordenaDirector);
        for (int i = 0; i < Peliculas.size(); i++) {
            System.out.println(Peliculas.get(i));
        }
    }
}

package utilidades;

import java.util.Comparator;
import moldes.Pelicula;

public class UtilidadPeliculas {

    public static Comparator<Pelicula> duracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };
     public static Comparator<Pelicula> duracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };
      public static Comparator<Pelicula> ordenaTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }

    };
       public static Comparator<Pelicula> ordenaDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDirector().compareTo(t.getDirector());
        }
    };
}

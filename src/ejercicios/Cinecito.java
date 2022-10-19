
package ejercicios;


import servicios.ServicioPelicula;
public class Cinecito {

    public static void main(String[] args) {
       ServicioPelicula sp=new ServicioPelicula();
       sp.crearPelicula();
       sp.mostrarLista();
       sp.mostrarPeliLarga();
       sp.ordenarDuracionMayor();
       sp.ordenarDuracionMenor();
       sp.ordenarTitulo();
       sp.ordenarDirector();
    }
}

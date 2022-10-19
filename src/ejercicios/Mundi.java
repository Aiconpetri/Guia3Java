
package ejercicios;

import servicios.ServicioPaises;


public class Mundi {

    public static void main(String[] args) {
       ServicioPaises sp=new ServicioPaises();
       sp.crearPais();
       sp.mostrarPaises();
       sp.ordenarPaises();
       sp.borrarPais();
       sp.ordenarPaises();
    }
}

package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import moldes.Pais;
import utilidades.UtilidadPaises;

public class ServicioPaises {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> Paises = new HashSet<>();
    UtilidadPaises un=new UtilidadPaises();
   
    public void crearPais() {
        String des;
        do {
            System.out.println("Ingrese un pais");
            Paises.add(new Pais(read.next()));
            System.out.println("¿Desea ingresar un nuevo pais?");
            des = read.next();
        } while (des.equalsIgnoreCase("si"));
    }
 
    public void mostrarPaises() {
        System.out.println("Se muestra la lista de paises");
        for (Pais aux:Paises){
            System.out.println(aux);
        }
    }
    
    public void ordenarPaises(){
        ArrayList <Pais> listaPais=new ArrayList<>(Paises);
        Collections.sort(listaPais, un.ordenNombre);
        System.out.println("Se muestran los paises ordenados");
        for (Pais aux:listaPais){
            System.out.println(aux);
        }
    }
    public void borrarPais(){
        Iterator<Pais> it=Paises.iterator();
        System.out.println("Ingrese un pais para borrarlo");
        String nombre=read.next();
      while(it.hasNext()){
          if(it.next().getNombre().equalsIgnoreCase(nombre)){
              it.remove();
          }
      }
    }
}

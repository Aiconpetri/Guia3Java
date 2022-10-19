
package servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import moldes.Mascota;

public class ServicioMascota {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    
 public Mascota crearMascota(){
     System.out.println("Ingrese la raza de la mascota");
     String Raza=read.next();
     return new Mascota(Raza);
 }
 public void mostrarMascota(ArrayList perro){
     for (Object aux: perro) {
         System.out.println(aux);
     }
 }
 public void borrarMascota(ArrayList perro){
     Iterator<Mascota> it= perro.iterator();
     System.out.println("Ingrese la raza que desea eliminar");
     String raza=read.next();
     while(it.hasNext()){
         Mascota aux=it.next();
         if(aux.getRaza().equals(raza)){
             it.remove();
         }
     }
 }
}

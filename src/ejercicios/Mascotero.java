package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import moldes.Mascota;
import servicios.ServicioMascota;
public class Mascotero {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        ServicioMascota sm = new ServicioMascota();
        ArrayList<Mascota> Perro = new ArrayList<>();
        String des;
        System.out.println("Cree una mascota");
        do{
        Perro.add(sm.crearMascota());
            System.out.println("¿Desea ingresar otra mascota?");
        des=read.next();
        }while (des.equalsIgnoreCase("SI"));
        sm.mostrarMascota(Perro);
        sm.borrarMascota(Perro);
        sm.mostrarMascota(Perro);
    }

}

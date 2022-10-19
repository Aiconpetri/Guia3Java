package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import moldes.Alumno;
import servicios.ServicioAlumno;

public class Curso {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        List<Alumno> alumnos = new ArrayList<>();
        ServicioAlumno sa = new ServicioAlumno();
        String des;
        String pibe;
        int cont = 0;
        System.out.println("Cree un alumno");
        do {
            alumnos.add(sa.crearAlumno());
            System.out.println("¿Desea crear otro alumno?");
            des = read.next();
        } while (des.equalsIgnoreCase("SI"));
        sa.mostrarAlumnos(alumnos);
        System.out.println("Ingrese el nombre del alumno del que quiere saber la nota final");
        pibe = read.next();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(pibe)) {
                cont = 1;
                System.out.println("La nota final del alumno es " + sa.notaFinal(alumnos.get(i)));
            }
        }
        if (cont == 0) {
            System.out.println("El alumno no se encuentra");
        }
    }
}

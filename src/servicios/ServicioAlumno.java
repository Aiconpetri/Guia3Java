
package servicios;

import moldes.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ServicioAlumno {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    public Alumno crearAlumno(){
        System.out.println("Ingrese el nombre del alumno");
        String nombre=read.next();
        List<Integer> notas=new ArrayList<>();
        System.out.println("Ingrese la primer nota del alumno");
        notas.add(read.nextInt());
        System.out.println("Ingrese la segunda nota del alumno");
        notas.add(read.nextInt());
        System.out.println("Ingrese la tercer nota del alumno");
        notas.add(read.nextInt());
       return new Alumno (nombre,notas);
    }
    public void mostrarAlumnos(List alumnos){
        System.out.println("Se muestran los alumnos");
         for (int i = 0; i < alumnos.size(); i++) {
             System.out.println(alumnos.get(i));
        }
    }
    public double notaFinal(Alumno a){
       double promedio=(double)(a.getNotas().get(0)+a.getNotas().get(1)+a.getNotas().get(2))/3;
        return promedio;
    }
}

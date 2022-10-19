/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moldes;
import java.util.List;


/**
 *
 * @author Nahuel
 */
public class Alumno {
    private String nombre;
    private List<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    } 
}

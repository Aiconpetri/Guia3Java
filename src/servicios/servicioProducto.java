package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class servicioProducto {

    HashMap<String, Double> productos = new HashMap<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public boolean menu() {
        boolean band = true;
        System.out.println("Menu");
        System.out.println("1-Agregar producto");
        System.out.println("2-Cambiar precio de producto");
        System.out.println("3-Elminar producto");
        System.out.println("4-Mostrar listado de productos");
        System.out.println("5-Salir");
        int des = read.nextInt();
        switch (des) {
            case 1:
                crearProducto();
                break;
            case 2:
                cambiarPrecio();
                break;
            case 3:
                eliminarProducto();
                break;
            case 4:
                mostrarListado();
                break;
            case 5:
                System.out.println("Saliendo del sistema");
                band = false;
                break;
            default:
                System.out.println("Ingrese una opcion valida dentro del menu");
                System.out.println("Volviendo al menu");
                break;
        }
        return band;
    }

    public void crearProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = read.next();
        System.out.println("Ingrese el precio del producto");
        Double precio = read.nextDouble();
        productos.put(nombre, precio);
        System.out.println("Producto añadido");
        System.out.println("Volviendo al menu");
    }

    public void cambiarPrecio() {
        int cont = 0;
        System.out.println("Ingrese el producto al que quiere cambiarle el precio");
        String nombre = read.next();
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            if (nombre.equalsIgnoreCase(aux.getKey())) {
                System.out.println("Ingrese el nuevo precio");
                Double precio = read.nextDouble();
                productos.put(aux.getKey(), precio);
                System.out.println("Se modifico el precio del prodcuto");
                System.out.println("Volviendo al menu");
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("El producto ingresado no existe. ¿Desea ingresarlo?");
            String des = read.next();
            if (des.equalsIgnoreCase("si")) {
                crearProducto();
            } else {
                System.out.println("Volviendo al menu");
            }
        }
    }

    public void eliminarProducto() {
        int cont=0;
        System.out.println("Ingrese que producto desea elminar");
        String nombre = read.next();
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            if (nombre.equalsIgnoreCase(aux.getKey())) {
                System.out.println("Se removio el producto");
                System.out.println("Volviendo al menu");
                nombre=aux.getKey();
                cont=1;
            }
        }
        if(cont==0){
            System.out.println("El producto que desea eliminar no se encuentra en la lista");
            System.out.println("Volviendo al menu");
        }else{
            productos.remove(nombre);
        }
    }
    public void mostrarListado(){
        System.out.println("Productos:");
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            System.out.println(aux.getKey()+": $"+aux.getValue());

        }
    }
}

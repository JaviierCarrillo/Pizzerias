package co.edu.uniquindio.pizza.obj;

import java.util.List;

public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto(String nombre, String masa, String salsa, List<String> ingredientes) {
        this.nombre = nombre;
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agregando ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();
    abstract public void cortar();
    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pizza = " +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}

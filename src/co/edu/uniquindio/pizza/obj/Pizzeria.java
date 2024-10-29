package co.edu.uniquindio.pizza.obj;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<PizzaProducto> pizzas;
    public Pizzeria(String nombre) {
        this.nombre = nombre;
        pizzas = new ArrayList();
    }

    public void agregarPizza(PizzaProducto p) {
        pizzas.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public List<PizzaProducto> getPizzas() {
        return pizzas;
    }

    @Override
    public String toString() {
        return "Pizzeria = " + nombre + ", pizzas=" + pizzas + ".";
    }

}

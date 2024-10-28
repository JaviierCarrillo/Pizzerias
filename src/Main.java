import co.edu.uniquindio.pizza.obj.PizzaProducto;
import co.edu.uniquindio.pizza.obj.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {







        System.out.println("Hello world!");
    }

    static List<Pizzeria> listadePizzerias;

    static void crearPizzerias(){
        listadePizzerias = new ArrayList<>();
        listadePizzerias.add(new Pizzeria("Pizzeria New York"));
        listadePizzerias.add(new Pizzeria("Pizzeria California"));
    }

    public void crearPizzas(){

    }

    static void hacerPedido(){

    }

}
package co.edu.uniquindio.pizza.obj;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> listadePizzerias;

    public Pedido() {

    }
    public void crearPizzerias(){
        listadePizzerias = new ArrayList<>();
        listadePizzerias.add("PizzeriaNewYork");
        listadePizzerias.add("PizzeriaCalifornia");
    }

    public void agregarPizza(String pizza){

    }

}

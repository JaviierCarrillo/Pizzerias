import co.edu.uniquindio.pizza.obj.PizzaProducto;
import co.edu.uniquindio.pizza.obj.Pizzeria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Pizzeria> listadePizzerias;
    public static void main(String[] args) {
        crearPizzerias();
        crearPizzas();
        hacerPedido();

    }

    static void crearPizzerias(){
        listadePizzerias = new ArrayList<>();
        listadePizzerias.add(new Pizzeria("Pizzeria New York"));
        listadePizzerias.add(new Pizzeria("Pizzeria California"));
    }

    static void crearPizzas(){
        listadePizzerias.get(0).agregarPizza(
                new PizzaProducto("PizzaNewYorkVegetariana", "Masa delgada", "Salsa de tomate",
                        Arrays.asList("Pimiento", "Champiñones", "Cebolla", "Tomate", "aceitunas")) {
                    @Override
                    public void cocinar() {
                        System.out.println("Cocinando a 180°C por 15 minutos.");
                    }

                    @Override
                    public void cortar() {
                        System.out.println("Cortando en 8 porciones.");
                    }
                }
        );

        listadePizzerias.get(0).agregarPizza(
                new PizzaProducto("PizzaNewYorkPepperoni", "Masa delgada", "Salsa de tomate",
                        Arrays.asList("Pepperoni", "Albahaca", "Queso mozzarella")) {
                    @Override
                    public void cocinar() {
                        System.out.println("Cocinando a 180°C por 15 minutos.");
                    }

                    @Override
                    public void cortar() {
                        System.out.println("Cortando en 8 porciones.");
                    }
                }
        );

        listadePizzerias.get(0).agregarPizza(
                new PizzaProducto("PizzaNewYorkItaliana", "Masa delgada", "Salsa de marinara",
                        Arrays.asList("Queso Mozzarella", "Tomate", "Albahaca", "Aceite de Oliva")) {
                    @Override
                    public void cocinar() {
                        System.out.println("Cocinando a 200°C por 20 minutos.");
                    }

                    @Override
                    public void cortar() {
                        System.out.println("Cortando en 8 porciones.");
                    }

                }
        );

        listadePizzerias.get(1).agregarPizza(
                new PizzaProducto("PizzaCaliforniaVegetariana", "Masa gruesa", "Salsa de ajo",
                        Arrays.asList("Espinacas", "Alcachofas", "Queso feta")) {
                    @Override
                    public void cocinar() {
                        System.out.println("Cocinando a 180°C por 15 minutos.");
                    }

                    @Override
                    public void cortar() {
                        System.out.println("Cortando en 6 porciones.");
                    }

                }
        );

        listadePizzerias.get(1).agregarPizza(
                new PizzaProducto("PizzaCaliforniaQueso", "Masa gruesa", "salsa Mayonesa",
                        Arrays.asList("Queso Mozzarella", "Queso Parmesano", "Queso Cheddar")) {
                    @Override
                    public void cocinar() {
                        System.out.println("Cocinando a 180°C por 15 minutos.");
                    }

                    @Override
                    public void cortar() {
                        System.out.println("Cortando en 6 porciones.");
                    }
                }
        );

        listadePizzerias.get(1).agregarPizza(
                new PizzaProducto("PizzaCaliforniapeperonni", "Masa gruesa", "salsa de tomate",
                        Arrays.asList("Pepperoni", "Queso Mozzarella", "Aceitunas")) {
                    @Override
                    public void cocinar() {
                        System.out.println("Cocinando a 180°C por 15 minutos.");
                    }

                    @Override
                    public void cortar() {
                        System.out.println("Cortando en 6 porciones.");
                    }
                }
        );
    }

    static void hacerPedido(){
        Scanner scanner = new Scanner(System.in);
        //Selecciona la pizzería
        System.out.println("Selecciona una pizzería: ");
        for (int i = 0; i < listadePizzerias.size(); i++) {
            System.out.println((i + 1) + ". " + listadePizzerias.get(i).getNombre());
        }
        int opcionPizzeria = scanner.nextInt() - 1;

        System.out.println("Elegiste Pizería =  " + listadePizzerias.get(opcionPizzeria).getNombre());
        System.out.println("Selecciona una Pizza: ");

        ordenarPizza(listadePizzerias.get(opcionPizzeria));


        System.out.println("FIN DEL PEDIDO");
    }


    static void ordenarPizza(Pizzeria pizzeria){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < pizzeria.getPizzas().size(); i++) {
            System.out.println((i + 1) + ". " + pizzeria.getPizzas().get(i));
        }
        int opcionPizza = scanner.nextInt() - 1;

        System.out.println("Elegiste la Pizza = " + pizzeria.getPizzas().get(opcionPizza).getNombre());
        pizzeria.getPizzas().get(opcionPizza).preparar();
        pizzeria.getPizzas().get(opcionPizza).cocinar();
        pizzeria.getPizzas().get(opcionPizza).cortar();
        pizzeria.getPizzas().get(opcionPizza).empaquetar();
    }

}
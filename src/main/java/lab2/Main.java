package lab2;

public class Main {
    public static void main(String[] args) {

        PizzaOperation pizzaOperation = new PizzaOperation();

        System.out.println("Najtansza ostra pizza: " + pizzaOperation.findCheapestSpicy());
        System.out.println("Najdrozsza pizza wegetarianska: " + pizzaOperation.findMostExpensiveVegetarian());
        System.out.println("\nPizza miesna:\n" + pizzaOperation.iLikeMeat());
        System.out.println("\nPizza z cena:\n" + pizzaOperation.groupByPrice());
        System.out.println("\nMENU:\n" + pizzaOperation.formatedMenu());
    }
}
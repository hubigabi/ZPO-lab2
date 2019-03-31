package lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PizzaOperationTest {

    @Test
    public void findCheapestSpicy() {
        PizzaOperation pizzaOperation = new PizzaOperation();
        Pizza pizza1 = pizzaOperation.findCheapestSpicy();
        Pizza pizza2 = Pizza.CARUSO;
        assertEquals(pizza1, pizza2);
    }

    @Test
    public void findMostExpensiveVegetarian() {
        PizzaOperation pizzaOperation = new PizzaOperation();
        Pizza pizza1 = pizzaOperation.findMostExpensiveVegetarian();
        Pizza pizza2 = Pizza.VEGETARIANA;
        assertEquals(pizza1, pizza2);
    }

    @Test
    public void iLikeMeat() {
        PizzaOperation pizzaOperation = new PizzaOperation();
        List<Pizza> pizzaMeatList1 = pizzaOperation.iLikeMeat();

        List<Pizza> pizzaMeatList2 = new ArrayList<>();
        pizzaMeatList2.add(Pizza.SOPRANO);
        pizzaMeatList2.add(Pizza.CALABRESE);
        pizzaMeatList2.add(Pizza.TABASCO);
        pizzaMeatList2.add(Pizza.FARMER);
        pizzaMeatList2.add(Pizza.CAPRI);
        pizzaMeatList2.add(Pizza.HAVAI);
        pizzaMeatList2.add(Pizza.CARUSO);
        pizzaMeatList2.add(Pizza.MAMA_MIA);
        pizzaMeatList2.add(Pizza.AMORE);

        assertEquals(pizzaMeatList1, pizzaMeatList2);
    }

    @Test
    public void groupByPrice() {
        PizzaOperation pizzaOperation = new PizzaOperation();
        Map<Pizza, Integer> pizzaMap1 = new HashMap<>(pizzaOperation.groupByPrice());

        Map<Pizza, Integer> pizzaMap2 = new HashMap<>();
        pizzaMap2.put(Pizza.CAPRESE, 19);
        pizzaMap2.put(Pizza.CALABRESE, 24);
        pizzaMap2.put(Pizza.MAMA_MIA, 18);
        pizzaMap2.put(Pizza.FOUR_CHEESE, 19);
        pizzaMap2.put(Pizza.VEGETARIANA, 20);
        pizzaMap2.put(Pizza.CAPRI, 17);
        pizzaMap2.put(Pizza.SOPRANO, 23);
        pizzaMap2.put(Pizza.PASCETORE, 16);
        pizzaMap2.put(Pizza.HAVAI, 17);
        pizzaMap2.put(Pizza.MARGHERITA, 13);
        pizzaMap2.put(Pizza.AMORE, 16);
        pizzaMap2.put(Pizza.CARUSO, 15);
        pizzaMap2.put(Pizza.TABASCO, 22);
        pizzaMap2.put(Pizza.FARMER, 22);

        assertEquals(pizzaMap1, pizzaMap2);
    }

    @Test
    public void formatedMenu() {
        PizzaOperation pizzaOperation = new PizzaOperation();
        String menu1 = pizzaOperation.formatedMenu();
        String menu2 = "Marrgherita: cienkie ciasto, sos pomidorowy, ser, 13\n" +
                "Capri: cienkie ciasto, sos pomidorowy, ser, szynka, pieczarki, 17\n" +
                "Havai: cienkie ciasto, sos pomidorowy, ser, szynka, ananas, 17\n" +
                "Caruso: cienkie ciasto, sos pomidorowy, kiełbasa, papryka peperoni, 15\n" +
                "Mama Mia: cienkie ciasto, sos pomidorowy, ser, cebula, pieczarki, bekon, 18\n" +
                "Soprano: grube ciasto, sos pomidorowy, ser, szynka, pieczarki, cebula, bekon, pieprz, 23\n" +
                "Calabrese: grube ciasto, sos pomidorowy, ser, szynka, pieczarki, kiełbasa, cebula, oliwki, 24\n" +
                "Vegetariana: cienkie ciasto, sos pomidorowy, ser, cebula, fasola, kukurydza, brokuły, rukola, 20\n" +
                "Caprese: grube ciasto, sos pomidorowy, mozarella, ser feta, pomidor, bazylia, 19\n" +
                "Pascetore: cienkie ciasto, sos pomidorowy, ser, tuńczyk, cebula, 16\n" +
                "Cztery sery: cienkie ciasto, sos pomidorowy, ser, mozarella, ser feta, ser pleśniowy, 19\n" +
                "Tabasco: grube ciasto, sos pomidorowy, ser, szynka, salami, papryka peperoni, kukurydza, tabasco, 22\n" +
                "Amore: cienkie ciasto, sos pomidorowy, ser, kurczak, pomidor, 16\n" +
                "Farmerska: grube ciasto, sos pomidorowy, ser, kurczak, bekon, cebula, kukurydza, 22\n";
        assertEquals(menu1, menu2);
    }
}
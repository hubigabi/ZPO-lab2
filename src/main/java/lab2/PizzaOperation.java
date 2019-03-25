package lab2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class PizzaOperation {

    Pizza findCheapestSpicy() {
        return Arrays
                .stream(Pizza.values())
                .filter(p -> p.getIngredients()
                        .stream()
                        .anyMatch(Ingredient::isSpicy))
                .min(Comparator.comparing(p -> p.getIngredients()
                        .stream()
                        .mapToInt(Ingredient::getPrice)
                        .sum()))
                .get();
    }

    Pizza findMostExpensiveVegetarian() {
        return Arrays
                .stream(Pizza.values())
                .filter(p -> p.getIngredients()
                        .stream()
                        .noneMatch(Ingredient::isMeat))
                .max(Comparator.comparing(p -> p.getIngredients()
                        .stream()
                        .mapToInt(Ingredient::getPrice)
                        .sum()))
                .get();
    }

    List iLikeMeat() {
        return Arrays
                .stream(Pizza.values())
                .filter(p -> p.getIngredients()
                        .stream()
                        .anyMatch(Ingredient::isMeat))
                .sorted(Comparator.comparing(p -> p.getIngredients()
                        .stream()
                        .filter(Ingredient::isMeat)
                        .count(), Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

    Map groupByPrice() {
        return Arrays
                .stream(Pizza.values())
                .collect(Collectors.toMap(p -> p,
                        x -> x.getIngredients()
                                .stream()
                                .mapToInt(Ingredient::getPrice)
                                .sum()));
    }

    String formatedMenu() {
        AtomicReference<String> atomicString = new AtomicReference<>("");
        Map<Pizza, Integer> pizzaMap = groupByPrice();

        Arrays.stream(Pizza.values())
                .forEach(p -> {
                    atomicString.getAndUpdate(s -> s + p.getName() + ": ");
                    p.getIngredients()
                            .forEach(i -> atomicString.getAndUpdate(s -> s + i.getName() + ", "));
                    atomicString.getAndUpdate(s -> s + pizzaMap.get(p).toString() + "\n");
                });
        return atomicString.toString();
    }

}

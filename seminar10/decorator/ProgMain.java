package decorator;

public class ProgMain {
    public static void main(String[] args) {
        APizza pizzaBasic = new PizzaBasic();
        System.out.println("Base Pizza:");
        System.out.println("Ingredients: " + pizzaBasic.getIngredient());
        System.out.println("Cost: $" + pizzaBasic.getCost());

        APizza pizzaChicken = new PizzaChicken(pizzaBasic);
        System.out.println("\nPizza with Chicken:");
        System.out.println("Ingredients: " + pizzaChicken.getIngredient());
        System.out.println("Cost: $" + pizzaChicken.getCost());
    }
}

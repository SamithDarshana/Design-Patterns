package Factory_Method;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();//(new SimplePizzaFactory());
        pizzaStore.orderPizza("Veggie");
        pizzaStore.orderPizza("Calm");
    }
}

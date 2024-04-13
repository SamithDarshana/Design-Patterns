public class Main {
    public static void main(String[] args) {
        Beverage beverage;
        beverage = new Espresso();
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + beverage.cost());
    }
}
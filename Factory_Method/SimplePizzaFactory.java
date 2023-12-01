package Factory_Method;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("Cheese")){
            pizza = new CheesePizza();
        } else if(type.equals("Calm")){
            pizza = new CalmPizza();
        } else if (type.equals("Veggie")){
            pizza = new VeggiePizza();
        } else if (type.equals("Pepperoni")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}

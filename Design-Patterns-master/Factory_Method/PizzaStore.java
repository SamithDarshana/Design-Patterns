package Factory_Method;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

    //public PizzaStore(SimplePizzaFactory factory){
    //    this.simplePizzaFactory = factory;
    //}
    public void orderPizza(String type){
        //Pizza pizza;
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

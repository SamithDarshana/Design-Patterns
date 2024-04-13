package Factory_Method;

public class PepperoniPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("Preparing pepperoni pizza");
    }

    @Override
    void bake() {
        System.out.println("Baking pepperoni pizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting pepperoni pizza");
    }

    @Override
    void box() {
        System.out.println("Boxing pepperoni pizza");
    }

}

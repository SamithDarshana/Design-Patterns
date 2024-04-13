package Factory_Method;

public class VeggiePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("Preparing veggie pizza");
    }

    @Override
    void bake() {
        System.out.println("Baking veggie pizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting veggie pizza");
    }

    @Override
    void box() {
        System.out.println("Boxing veggie pizza");
    }
}

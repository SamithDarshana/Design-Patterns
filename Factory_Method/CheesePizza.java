package Factory_Method;

public class CheesePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("Preparing cheese pizza");
    }

    @Override
    void bake() {
        System.out.println("Baking cheese pizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting cheese pizza");
    }

    @Override
    void box() {
        System.out.println("boxing cheese pizza");
    }
}

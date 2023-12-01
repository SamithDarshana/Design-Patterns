package Factory_Method;

public class CalmPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("Preparing calm pizza");
    }

    @Override
    void bake() {
        System.out.println("Baking calm pizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting calm pizza");
    }

    @Override
    void box() {
        System.out.println("Boxing calm pizza");
    }
}

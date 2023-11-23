package Duck_example;
import Duck_example.MollardDuck;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        MollardDuck mollardDuck = new MollardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();

        mollardDuck.normalDuck("Mollard");
        mollardDuck.fly();
        rubberDuck.normalDuck("Rubber");
    }
}
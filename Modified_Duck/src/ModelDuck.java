public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    void display() {
        System.out.println("I am model duck");
    }
}

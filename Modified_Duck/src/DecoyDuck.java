public class DecoyDuck extends Duck{

    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("I am decoy duck");
    }
}

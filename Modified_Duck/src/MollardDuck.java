public class MollardDuck extends Duck{
    public MollardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyingWithWings();
    }
    public void display(){
        System.out.println("I am Mollard duck");
    }
}

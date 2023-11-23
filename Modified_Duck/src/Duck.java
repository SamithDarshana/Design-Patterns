public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    } // override the current flybehavior instance
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    void normalDuck(){
        display();
        performQuack();
        performFly();
        swim();
    }
    abstract void display();
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("I can swim");
    }
}

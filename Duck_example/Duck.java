package Duck_example;

public abstract class Duck {
    void normalDuck(String type){
        display();
        quack(type);
        swim(type);
        fly();
    }

    abstract void display();

    void swim(String type) {
        System.out.println(type + " Duck can swim");
    }

    void quack(String type) {
        System.out.println(type + " Duck can quack");
    }

    void fly(){
        System.out.println("Duck can fly");
    }

}

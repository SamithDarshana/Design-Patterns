package Duck_example;

public class RubberDuck extends Duck{


    public void display(){
        System.out.println("This is rubber duck");
    }
    @Override
    public void quack(String type){
        System.out.println(type + "duck can squeak");
    }
}

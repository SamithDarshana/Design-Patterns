package Animal_example;

public class Crocadile extends Animal{
    public Crocadile(EatBehavior eb, MoveBehavior mb) {
        super(eb, mb);
    }

    public void display(){
        System.out.println("I am crocodile");
    }

}

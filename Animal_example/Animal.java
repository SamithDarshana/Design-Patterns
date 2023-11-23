package Animal_example;

public abstract class Animal {

    EatBehavior eatBehavior;
    MoveBehavior moveBehavior;

    public Animal(EatBehavior eb, MoveBehavior mb){
        this.eatBehavior = eb;
        this.moveBehavior = mb;
    }

    public void animalBehavior(){
        display();
        performEat();
        performMove();
        sleep();
    }
    abstract void display();
    public void performEat(){
        eatBehavior.eat();
    }
    public void performMove(){
        moveBehavior.move();
    }
    public void sleep(){
        System.out.println("I sleep");
    }
}

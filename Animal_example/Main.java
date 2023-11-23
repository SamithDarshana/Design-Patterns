package Animal_example;

public class Main {
    public static void main(String[] args) {
        //Animal dog = new Animal(new Omnivores(), new Walk());
       // dog.animalBehavior();
        Crocadile crocadile = new Crocadile(new Carnivores(), new Crawl());
        crocadile.animalBehavior();
    }
}

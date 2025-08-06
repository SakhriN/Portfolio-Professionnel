import factory.AnimalFactory;
import factory.CatFactory;
import factory.DogFactory;
import models.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();
        cat.takeAShit();
        cat.IsAlive();


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();
        dog.takeAShit();
        dog.IsAlive();
    }
}
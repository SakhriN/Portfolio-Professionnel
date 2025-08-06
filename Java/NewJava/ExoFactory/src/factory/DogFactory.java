package factory;

import models.Animal;
import models.Dog;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

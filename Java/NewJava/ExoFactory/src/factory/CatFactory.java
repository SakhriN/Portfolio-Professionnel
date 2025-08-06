package factory;

import models.Animal;
import models.Cat;

public class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

package animals;

public class Mammal extends Animal {


    public Mammal(String name,String species) {
        super(name,species);
    }

    @Override
    public String getDetails() {
        return getName() + getSpecies() + getId();
    }

    @Override
    public void eat() {
        System.out.println("Vous tentez de lui donner a manger.");
    }
}

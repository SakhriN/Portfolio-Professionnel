package animals;

public class Bird extends Animal {


    public Bird(String name,String species) {
        super(name,species);
    }

    @Override
    public String getDetails() {
        return getName() + getSpecies() + getId();
    }

    @Override
    public void eat() {
        System.out.println("L'oiseau mange ce que vous lui donnez.");
    }
}

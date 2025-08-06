package animals;

public abstract class Animal {

    private int id;
    private String name;
    private String species;
    private int count = 1;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Animal( String name, String species) {
        this.id = count++;
        this.name = name;
        this.species = species;
    }

    public abstract String getDetails();

    public abstract void eat();

}

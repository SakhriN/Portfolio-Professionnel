package decorator;

import factory.Toy;

public abstract class ToyDecorator implements Toy {
    protected Toy toy;

    public ToyDecorator(Toy toy) {
        this.toy = toy;
    }
    public String getDescription(){
        return toy.getDescription();
    }
}

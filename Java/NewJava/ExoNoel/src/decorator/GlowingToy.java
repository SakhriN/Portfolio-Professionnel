package decorator;

import factory.Toy;

public class GlowingToy extends ToyDecorator{

    public GlowingToy(Toy toy) {
        super(toy);
    }

    @Override
    public void plays() {
    }

    public String getDescription() {
        return super.getDescription() + ", un jouet qui illumine de 1000 feux";
    }
}

package decorator;

import factory.Toy;

public class VibratingToy extends ToyDecorator{

    public VibratingToy(Toy toy) {
        super(toy);
    }

    @Override
    public void plays() {
    }

    public String getDescription() {
        return super.getDescription() + ", jouet vibrant tel un homme en colère qui tappe dans tous les sens.";
}
}

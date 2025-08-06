package factory;

public class MiniCarFactory extends ToyFactory {

    @Override
    public Toy createToy() {
        return new MiniCar();
    }
}

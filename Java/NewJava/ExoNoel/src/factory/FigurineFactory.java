package factory;

public class FigurineFactory extends ToyFactory {

    @Override
    public Toy createToy() {
        return new Figurine();
    }
}

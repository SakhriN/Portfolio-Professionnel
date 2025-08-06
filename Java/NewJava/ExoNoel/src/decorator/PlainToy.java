package decorator;

import factory.Toy;

public class PlainToy implements Toy {

    @Override
    public void plays() {
    }

    @Override
public String getDescription() {
        return "Très bon jouet ";
}




}

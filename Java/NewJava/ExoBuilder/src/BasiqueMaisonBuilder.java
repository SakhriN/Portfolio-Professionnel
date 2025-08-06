public class BasiqueMaisonBuilder implements MaisonBuilder{
    private Maison maison = new Maison();

    @Override
    public void setName(String name) {
        maison.setName(name);
    }

    @Override
    public void setNumberFloor(int numberFloor) {
        maison.setNumberFloor(numberFloor);
    }

    @Override
    public void setTypeRoof(String typeRoof) {
        maison.setTypeRoof(typeRoof);
    }

    @Override
    public void setHasPool(boolean hasPool) {
        maison.setHasPool(hasPool);
    }

    public void setSquatteurs(int squatteurs) {
        maison.setSquatteurs(squatteurs);
    }


    public Maison build(){
        return maison;
    }
}

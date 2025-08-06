public class Maison {

    private String name;
    private int numberFloor;
    private String typeRoof;
    private int squatteurs;
    private boolean hasPool;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public String getTypeRoof() {
        return typeRoof;
    }

    public void setTypeRoof(String typeRoof) {
        this.typeRoof = typeRoof;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public int getSquatteurs() {
        return squatteurs;
    }

    public void setSquatteurs(int squatteurs) {
        this.squatteurs = squatteurs;
    }

    public Maison() {
    }

    @Override
    public String toString() {
        return "La maison suivante est nommée " + name +
                ", a " +
                 numberFloor + " étage(s), et son toit est en " +
                 typeRoof + '.' +
                "A t-il une piscine ? " + hasPool +
                ".\n" +
                "Oh non, il y'a désormais "+ squatteurs + " squatteurs dans ta maison.";
    }
}

public interface MaisonBuilder
{
    void setName(String name);
    void setNumberFloor(int numberFloor);
    void setTypeRoof(String typeRoof);
    void setHasPool(boolean hasPool);
    void setSquatteurs(int squatteurs);
    Maison build();
}

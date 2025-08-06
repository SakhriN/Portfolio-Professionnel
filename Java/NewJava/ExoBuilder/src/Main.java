//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasiqueMaisonBuilder basiqueMaisonBuilder = new BasiqueMaisonBuilder();
        basiqueMaisonBuilder.setName("Jean Michel");
        basiqueMaisonBuilder.setNumberFloor(125);
        basiqueMaisonBuilder.setTypeRoof("Nylon acheté il y'a 17 ans");
        basiqueMaisonBuilder.setHasPool(false);
        basiqueMaisonBuilder.setSquatteurs((int)(Math.round(Math.random()*5)));
        Maison maison = basiqueMaisonBuilder.build();
        System.out.println(maison.toString());
    }
}
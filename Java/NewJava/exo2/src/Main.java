//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibraryItem item = new Book(1,"La sodomie pour les nuls",2012,"Nassim Sakhri","Degueulasse");
        LibraryItem item2 = new Magazine(2,"Mein Kampf", 1924,1);
        System.out.println(item.toString());
        System.out.println(item2.toString());

    }
}
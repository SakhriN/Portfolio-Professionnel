//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Text baseText = new MyText();
        System.out.println(baseText.transform());

        Text preText = new PreDecorator(baseText);
        System.out.println(preText.transform());

        Text sufText = new SufDecorator(preText);
        System.out.println(sufText.transform());

        Text majText = new UpperCaseDecorator(baseText);
        System.out.println(majText.transform());

        Text minText = new LowerCaseDecorator(majText);
        System.out.println(minText.transform());
    }
}
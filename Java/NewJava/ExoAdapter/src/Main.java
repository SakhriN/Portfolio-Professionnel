//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double amount;
        CurrencyConverter currencyConverter = new CurrencyConverter();
        CurrencyAdapter currencyAdapter = new CurrencyAdapterConverter(currencyConverter);

        amount = 100;
        System.out.println("La monnaie de base est de " + amount + " euros, nous allons le transformer en GBP.");
        amount = currencyAdapter.convertToCurrency("EUR","GBP",amount);
        System.out.println("\n La monnaie est transformée en "+ amount + " GBP.");

        amount = 100;
        amount = currencyAdapter.convertToCurrency("EUR","USD",amount);
        System.out.println("\n La monnaie est transformée en "+ amount + " USD.");

        amount = 60;
        amount = currencyAdapter.convertToCurrency("GBP","USD",amount);
        System.out.println("\n La monnaie est transformée en "+ amount + " USD.");

    }
}
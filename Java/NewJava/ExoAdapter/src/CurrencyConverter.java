public class CurrencyConverter implements CurrencyAdapter{

    private CurrencyConverter currencyConverter;


    @Override
    public double convertToCurrency(String fromCurrency, String toCurrency, double amount) {
        switch (fromCurrency) {
            case "EUR" -> {
                if (toCurrency.equals("USD")) {
                    amount = amount * 0.85;
                } else if (toCurrency.equals("GBP")) {
                    amount = amount * 1.05;
                }
                return amount;
            }
            case "USD" -> {
                if (toCurrency.equals("EUR")) {
                    amount = amount / 1.1;
                } else if (toCurrency.equals("GBP")) {
                    amount = amount * 1.3;
                }
                return amount;
            }
            case "GBP" -> {
                if (toCurrency.equals("EUR")) {
                    amount = amount / 0.85;
                } else if (toCurrency.equals("USD")) {
                    amount = amount * 1.3;
                }
                return amount;
            }
            default -> {
            }
        }
        return amount;
    }
}

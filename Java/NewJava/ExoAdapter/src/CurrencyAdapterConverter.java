public class CurrencyAdapterConverter implements CurrencyAdapter {
    private CurrencyConverter currencyConverter;


    public CurrencyAdapterConverter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    @Override
    public double convertToCurrency(String fromCurrency, String toCurrency, double amount){
        return currencyConverter.convertToCurrency(fromCurrency, toCurrency, amount);
    }
}

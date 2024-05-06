import br.com.alura.currencyconverter.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- CURRENCY CONVERTER -------");
        CurrencyConverter converter = new CurrencyConverter();
        converter.setDollarExchangeRate(5.07);
        converter.setDollarValue(100);
        System.out.printf("Dollar exchange rate: U$%.2f\n", converter.getDollarExchangeRate());
        System.out.printf("Value in dollars....: U$%.2f\n", converter.getDollarValue());
        System.out.printf("Value in Reais......: R$%.2f\n", converter.convertDollarToReal(converter.getDollarValue()));

    }
}

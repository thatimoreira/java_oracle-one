package br.com.alura.part04.currencyconverter;

public class CurrencyConverter implements FinancialConversion {
    private double  dollarExchangeRate;
    private double  dollarValue;
    private double  realValue;

    public double getDollarExchangeRate() {
        return dollarExchangeRate;
    }

    public void setDollarExchangeRate(double dollarExchangeRate) {
        this.dollarExchangeRate = dollarExchangeRate;
    }

    public double getDollarValue() {
        return dollarValue;
    }

    public void setDollarValue(double dollarValue) {
        this.dollarValue = dollarValue;
    }

    @Override
    public double    convertDollarToReal(double dollarValue){
        realValue = dollarValue * getDollarExchangeRate();
        return realValue;
    }
}

package br.com.alura.part04.productpricecalculator;

public class PhysicalProduct implements Calculable {
    String  productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double  calculateFinalPrice(double productPrice, double discount) {
        double feesPercent = 0;
        double  feesValue = 0;
        double finalPrice;
        if (productPrice < 100) {
            return (productPrice * (discount / 100));
        } else if (productPrice < 500) {
            feesPercent = 10;
        } else if (productPrice < 1000) {
            feesPercent = 15;
        }
        else
            feesPercent = 20;
        productPrice *= 1 - (discount / 100);
        feesValue = productPrice * (feesPercent / 100);
        finalPrice = productPrice + feesValue;
        return finalPrice;
    }
}

package br.com.alura.javafundamentals.part02;

public class Product {
    private String productName;
    private double  price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double discountPercentage){
        this.price = price * (1 - (discountPercentage / 100));

        return this.price;
    }

    public void showProductDetails(){
        System.out.printf("Name............: %s\n", productName);
        System.out.printf("Price...........: R$%.2f\n", price);
    }
}

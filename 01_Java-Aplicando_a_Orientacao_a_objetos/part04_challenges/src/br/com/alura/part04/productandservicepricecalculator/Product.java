package br.com.alura.part04.productandservicepricecalculator;

public class Product implements Sellable {
    String  type = "product";
    String  productName;
    double  productPrice;
    int quantity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double   calculateProductTotalPrice(int quantity) {
        double  finalPrice;
        double  discount = 0;

        if (quantity < 5) {
            return this.productPrice;
        }
        if (quantity < 11){
            discount = 3 / 100;
        } else if (quantity < 16) {
            discount = 5 / 100;
        } else if (quantity < 21) {
            discount = 7 / 100;
        }
        else
            discount = 10 / 100;
        finalPrice = this.productPrice * quantity * (1 - discount);
        return finalPrice;
    }
}

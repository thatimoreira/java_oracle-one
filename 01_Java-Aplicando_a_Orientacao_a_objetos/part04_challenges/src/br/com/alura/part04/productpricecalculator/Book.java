package br.com.alura.part04.productpricecalculator;

public class Book implements Calculable {
    String  bookTitle;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public double  calculateFinalPrice(double bookPrice, double discount) {
        double finalPrice = bookPrice * (1 - (discount / 100));
        return finalPrice;
    }
}

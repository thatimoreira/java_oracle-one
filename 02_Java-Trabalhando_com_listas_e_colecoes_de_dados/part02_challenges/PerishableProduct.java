package part02_challenges;

import java.time.LocalDate;

public class PerishableProduct extends Product{
    private LocalDate expirationDate;

    public PerishableProduct(String productName, double price, int quantity, LocalDate expirationDate) {
        super(productName, price, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " => expiration date=" + expirationDate;
    }
}

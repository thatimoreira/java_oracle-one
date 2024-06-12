package part02_challenges;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<>();

        Product tShirt = new Product("T-Shirt", 59.99, 3);
        Product skirt = new Product("Skirt", 79.95, 5);
        Product runningTennis = new Product("Running Tenis", 678.97, 7);
        Product bottle = new Product("Bottle", 39.80, 10);
        PerishableProduct proteinBar = new PerishableProduct(
                "Protein bar", 15.99, 14, LocalDate.of(2025, 1, 21));

        productsList.add(tShirt);
        productsList.add(skirt);
        productsList.add(runningTennis);
        productsList.add(bottle);
        productsList.add(proteinBar);

        System.out.printf("Products list size: %d\n\n", productsList.size());

        System.out.printf("The 3rd product of the list is %s\n\n", productsList.get(2).getProductName());

        System.out.println("Product list:");
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
}

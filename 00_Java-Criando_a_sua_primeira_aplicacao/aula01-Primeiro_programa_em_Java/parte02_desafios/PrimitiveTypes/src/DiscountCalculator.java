/*
**  BRAZILIAN PORTUGUESE:
**  Declare uma variável do tipo double precoOriginal.
**  Atribua um valor em reais a essa variável, representando o preço original de um produto.
**  Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor
**  percentual de desconto ao produto (por exemplo, 10 para 10%).
**  Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço
**  com desconto.
**
**  ENGLISH:
**  Declare a variable of type double originalPrice.
**  Assign a value in reais to this variable, representing the original price of a product.
**  Then, declare a variable of type double discountPercentage and assign a discount
**  percentage value to the product (for example, 10 for 10%).
**  Calculate the discount value in reais, apply it to the original price, and print the new
**  discounted price
*/

import java.util.Scanner;

public class DiscountCalculator
{
    public static void main(String[] args)
    {
        double  originalPrice;
        double  discountPercentage;
        double  discountValue;
        double  discountedPrice;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.print("Product price: R$ ");
        originalPrice = keyboard.nextDouble();
        keyboard = new Scanner(System.in);
        System.out.print("Discount percentage: ");
        discountPercentage = keyboard.nextDouble();
        keyboard.close();
        discountValue = originalPrice * (discountPercentage / 100);
        discountedPrice = originalPrice - discountValue;
        System.out.printf("Discount value: R$%.2f\n", discountValue);
        System.out.printf("Discounted price: R$%.2f\n", discountedPrice);
    }
}

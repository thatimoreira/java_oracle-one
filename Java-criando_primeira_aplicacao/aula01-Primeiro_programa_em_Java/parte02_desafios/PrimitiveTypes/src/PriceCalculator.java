/*
**  Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
**  Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o
**  resultado em uma mensagem.
*/

import java.util.Scanner;;

public class PriceCalculator
{
    public static void main(String[] args)
    {
        double  productPrice;
        int     quantity;
        double  purchaseAmount;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.print("Product price: R$ ");
        productPrice = keyboard.nextDouble();
        keyboard = new Scanner(System.in);
        System.out.print("Quantity: ");
        quantity = keyboard.nextInt();
        keyboard.close();
        purchaseAmount = quantity * productPrice;
        System.out.printf("Purchase amount: R$%.2f\n", purchaseAmount);
    }
}

/*
**  BRAZILIAN PORTUGUESE:
**      Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
**      Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o
**      resultado em uma mensagem.
**
**  ENGLISH:
**      Declare a variable of type double productPrice and an integer variable (quantity).
**      Calculate the total value by multiplying the product price by the quantity and
**      display the result in a message.
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

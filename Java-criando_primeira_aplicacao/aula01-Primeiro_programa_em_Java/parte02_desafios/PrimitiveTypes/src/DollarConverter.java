/*
**  BRAZILIAN PORTUGUESE:
**      1. Declare uma variável do tipo double valorEmDolares.
**      2. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
**      4. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
**
**  ENGLISH:
**      1. Declare a variable of type double valueInDollars.
**      2. Assign a value in dollars to this variable. Consider that the value of 1 dollar is equivalent to 4.94 reais.
**      4. Perform the conversion from dollars to reais and print the result formatted.
*/

import java.util.Scanner;

public class DollarConverter
{
    public static void main(String[] args)
    {
        double  valueInDollars;
        double  valueInReais;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.print("Value in dollars: $");
        valueInDollars = keyboard.nextDouble();
        keyboard.close();
        valueInReais = valueInDollars * 4.94;
        System.out.printf("Value in reais:  R$%.2f\n", valueInReais);
    }
}

/*
**  BRAZILIAN PORTUGUESE:
**      Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
**      se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
**
**  ENGLISH:
**      Ask the user to enter two integers. Compare the numbers and print a message indicating
**      if they are equal, different, the first is greater or the second is greater.
*/

import java.util.Scanner;

public class NumberComparator
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner keyboard;
        
        keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        keyboard = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();
        keyboard.close();
        if (num1 == num2)
        {
            System.out.println("The numbers are equal");
        }
        else
        {
            if (num1 > num2)
            {
                System.out.printf("The first number (%d) is greater than the second (%d) one\n", num1, num2);
            }
            else
            {
                System.out.printf("The second number (%d) is greater than the first (%d) one\n", num2, num1);
            }
        }
    }
}

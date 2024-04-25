/*
**  BRAZILIAN PORTUGUESE:
**      Crie um programa que solicite ao usuário a entrada de um número inteiro.
**      Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
**
**  ENGLISH:
**      Create a program that asks the user for an integer input.
**      Check if the number is even or odd and display a corresponding message.
*/

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        int     num;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("\n======= EVEN OR ODD =======\n");
        System.out.print("Enter an integer number: ");
        num = keyboard.nextInt();
        keyboard.close();
        if (num % 2 == 0)
        {
            System.out.printf("%d is even\n", num);
        }
        else
        {
            System.out.printf("%d is odd\n", num);
        }
        System.out.println("\n===========================\n");
    }
}

/*
**  BRAZILIAN PORTUGUESE:
**      Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
**
**  ENGLISH:
**      Create a program that asks the user for a number and calculates the factorial of that number.
*/

import java.util.Scanner;

public class FactorialCalculator
{
    public static void main(String[] args)
    {
        int     num;
        int     factorial;
        Scanner keyboard;

        num = 0;
        factorial = 1;
        System.out.println("\n=== FACTORIAL CALCULATOR ===\n");
        keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = keyboard.nextInt();
        keyboard.close();
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        System.out.printf("%d! = %d\n", num, factorial);
        System.out.println("\n============================\n");
    }
}

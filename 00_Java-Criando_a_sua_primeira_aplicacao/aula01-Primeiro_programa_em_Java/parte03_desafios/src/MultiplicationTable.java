/*
**  BRAZILIAN PORTUGUESE:
**      Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
**
**  ENGLISH:
**      Create a program that asks the user for a number and displays the multiplication table of that number from 1 to 10.
*/

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int     num;
        Scanner keyboard;

        num = 0;
        keyboard = new Scanner(System.in);
        System.out.println("=== MULTIPLICATION TABLE ===\n");
        System.out.print("Enter a number: ");
        num = keyboard.nextInt();
        keyboard.close();
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
        System.out.println("\n============================\n");
    }
}

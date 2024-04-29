/*
**  BRAZILIAN PORTUGUESE:
**      Crie um programa que solicite ao usuário digitar um número.
**      Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
**
**  ENGLISH:
**      Create a program that asks the user to enter a number.
**      If the number is positive, display "Positive number", otherwise, display "Negative number".
*/

import java.util.Scanner;

public class NumberChecker
{
    public static void main(String[] args)
    {
        double  num;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = keyboard.nextDouble();
        keyboard.close();
        if (num < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Positive number");
        }
    }
}
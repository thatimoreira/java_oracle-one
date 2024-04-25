/*
**  BRAZILIAN PORTUGUESE:
**      1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
**      2. Declare uma variável do tipo double e uma variável do tipo int.
**         Faça o casting da variável double para int e imprima o resultado.
**
**  ENGLISH:
**      1. Create a program that calculates the average of two decimal grades and displays the result.
**      2. Declare a variable of type double and an integer variable.
**         Cast the double variable to int and print the result
*/

import java.util.Scanner;

public class GradeAverage
{
    public static void main(String[] args)
    {
            Scanner keyboard;
            double  grade1;
            double  grade2;
            double  averageDouble;
            int     averageInt;

            keyboard = new Scanner(System.in);
            System.out.print("Grade 1: ");
            grade1 = Double.parseDouble(keyboard.nextLine());
            keyboard = new Scanner(System.in);
            System.out.print("Grade 2: ");
            grade2 = Double.parseDouble(keyboard.nextLine());
            averageDouble = (grade1 + grade2) / 2;
            averageInt = (int)Math.round(averageDouble);
            System.out.println("\n========== AVERAGE ==========");
            System.out.printf("with decimal places:    %.2f\n", averageDouble);
            System.out.printf("without decimal places: %d\n", averageInt);
            System.out.println("=============================");
    }
}

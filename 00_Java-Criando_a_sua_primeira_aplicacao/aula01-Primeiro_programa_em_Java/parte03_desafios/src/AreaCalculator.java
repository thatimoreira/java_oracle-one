/*
**  BRAZILIAN PORTUGUESE:
**      Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
**      Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
**
**  ENGLISH:
**      Create a menu that offers two options to the user: "1. Calculate the square area" and "2. Calculate the circle area".
**      Ask for the user's choice and calculate the area based on the selected option.
*/

import java.util.Scanner;

public class AreaCalculator
{
    public static void main(String[] args)
    {
        int     userOption;
        Scanner keyboard;

        userOption = -1;
        keyboard = new Scanner(System.in);
        System.out.println("\n=========== AREA CALCULATOR ===========");
        while (userOption != 0)
        {
            System.out.println("\nChoose an option:");
            System.out.println("1. Calculate the square area");
            System.out.println("2. Calculate the circle area");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            userOption = keyboard.nextInt();
            switch (userOption) {
                case 1:
                {
                    System.out.print("\nSquare side length: ");
                    double  side = keyboard.nextDouble();
                    double  squareArea = side * side;
                    System.out.printf("Square area = %.2f\n", squareArea);
                    break;
                }
                case 2:
                {
                    System.out.print("\nCircle radius: ");
                    double  radius = keyboard.nextDouble();
                    double  circleArea = 3.14 * radius * radius;
                    System.out.printf("Circle Area = %.2f\n", circleArea);
                    break;
                }
                case 0:
                {
                    System.out.println("\nExiting...");
                    break;
                }
                default:
                {
                    System.out.println("\nInvalid option. Please, try again.");
                }
            }
        }
        keyboard.close();
        System.out.println("\n=======================================");
    }
}

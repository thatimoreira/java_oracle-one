/*
**      1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
**      2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável
**      double para int e imprima o resultado.
* */

import java.util.Scanner;

public class MediaNotas
{
    public static void main(String[] args)
    {
            Scanner teclado;
            double  nota1;
            double  nota2;
            double  mediaDouble;
            int     mediaInt;

            teclado = new Scanner(System.in);
            System.out.print("Nota 1: ");
            nota1 = Double.parseDouble(teclado.nextLine());
            teclado = new Scanner(System.in);
            System.out.print("Nota 1: ");
            nota2 = Double.parseDouble(teclado.nextLine());
            mediaDouble = (nota1 + nota2) / 2;
            mediaInt = (int)Math.round(mediaDouble);
            System.out.println("\n========= MÉDIA =========");
            System.out.printf("Com casas decimais: %.2f\n", mediaDouble);
            System.out.printf("Sem casas decimais: %d\n", mediaInt);
            System.out.println("=========================");
    }
}

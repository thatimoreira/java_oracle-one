/*
**  Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
**  Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
**  Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido
**  de Celsius para Fahrenheit.
**
**  Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
**
**  Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira
**  para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará
**  fazer um casting de valores.
*/

import java.util.Scanner;

public class TemperatureConversion
{
    public static void main(String[] args)
    {
        double  tempCelsius;
        double  tempFahrenheit;
        double  intFahrenheit;
        Scanner teclado;
        String  mensagem;

        teclado = new Scanner(System.in);
        System.out.print("Temperatura em Celsius:    ");
        tempCelsius = Double.parseDouble(teclado.nextLine());
        tempFahrenheit = (tempCelsius * 1.8) + 32;
        intFahrenheit = (int)Math.round(tempFahrenheit);
        System.out.printf("Temperatura em Fahrenheit: %.2fºF\n", tempFahrenheit);
        System.out.println("Temp Fahrenheit - s/casas decimais: " + String.format("%.0f", intFahrenheit) + "ºF");
    }
}

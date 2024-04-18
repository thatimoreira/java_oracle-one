import java.util.Scanner;

public class Perfil
{
    public static void main(String[] args)
    {
        String nome;
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.printf("Olá, %s! Tudo bem?%n", nome);
    }
}
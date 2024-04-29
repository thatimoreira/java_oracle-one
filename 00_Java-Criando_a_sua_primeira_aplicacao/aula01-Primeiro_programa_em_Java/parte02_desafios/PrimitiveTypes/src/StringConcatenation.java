/*
**  BRAZILIAN PORTUGUESE:
**      Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
**      Atribua valores a essas variáveis e concatene-as em uma mensagem.
**
**  ENGLISH:
**      Declare a variable of type char (letter) and a String variable (word).
**      Assign values to these variables and concatenate them in a message.
*/

import java.util.Scanner;

public class StringConcatenation
{
    public static void main(String[] args)
    {
        char    letter;
        String  word;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.print("Letter: ");
        letter = keyboard.next().charAt(0);
        keyboard = new Scanner(System.in);
        System.out.print("Word: ");
        word = keyboard.nextLine();
        keyboard.close();
        System.out.printf("Letter + Word => %c %s\n", letter, word);
    }
}

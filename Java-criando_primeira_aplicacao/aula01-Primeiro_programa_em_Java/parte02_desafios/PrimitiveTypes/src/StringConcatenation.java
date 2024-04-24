/*
**  Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
**  Atribua valores a essas variáveis e concatene-as em uma mensagem.
*/

public class StringConcatenation
{
    public static void main(String[] args)
    {
        char    article;
        String  phrase;

        article = 'A';
        phrase = "man is walking down the street.";
        System.out.printf("%s %s\n", article, phrase);
    }
}

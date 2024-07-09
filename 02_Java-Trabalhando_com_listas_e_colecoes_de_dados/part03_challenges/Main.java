package part03_challenges;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Java");
        stringsList.add("C");
        stringsList.add("C++");
        stringsList.add("C#");
        stringsList.add("Python");

        for (String item : stringsList) {
            System.out.println(item);
        }

        Animal animal = new Cachorro("Totó");
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro)animal;
        } else {
            System.out.println("Objeto não é do tipo Cachorro.");
        }
    }
}

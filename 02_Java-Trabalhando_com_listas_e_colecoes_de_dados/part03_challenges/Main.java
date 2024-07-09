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

        Cachorro myCachorro = new Cachorro("Totó");
        Animal animal = (Animal)myCachorro;
    }
}

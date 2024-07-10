package part04_challenges;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerNbrsList = new ArrayList<>();
        integerNbrsList.add(11);
        integerNbrsList.add(7);
        integerNbrsList.add(3);
        integerNbrsList.add(5);
        integerNbrsList.add(14);
        integerNbrsList.add(1);

        Collections.sort(integerNbrsList);

        System.out.println("Sorted list: " + integerNbrsList);

        System.out.println("\n------- Exercises 2 and 3 -------");
        ArrayList<Title> titlesList = new ArrayList<>();
        titlesList.add(new Title("Qualquer coisa"));
        titlesList.add(new Title("Outra coisa"));
        titlesList.add(new Title("Nada aqui"));
        titlesList.add(new Title("Acolá"));
        titlesList.add(new Title("Tudo bem?"));

        Collections.sort(titlesList);

        for (Title title : titlesList) {
            System.out.println(title.getName());
        }
    }
}

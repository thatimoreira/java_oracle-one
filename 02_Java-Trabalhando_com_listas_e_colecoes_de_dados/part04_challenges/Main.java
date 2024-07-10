package part04_challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

        System.out.println("\n-------     Exercise 5     -------");
        List<String> polymorphicList;

        polymorphicList = new ArrayList<>();
        polymorphicList.add("1st item");
        polymorphicList.add("2nd item");
        polymorphicList.add("3rd item");
        System.out.println("ArrayList: " + polymorphicList);
        
        polymorphicList = new LinkedList<>();
        polymorphicList.add("Element A");
        polymorphicList.add("Element B");
        polymorphicList.add("Element C");
        System.out.println("LinkedList: " + polymorphicList);
    }
}

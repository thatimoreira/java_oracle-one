import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        Person person1 = new Person("Thais", 23);
        Person person2 = new Person("Roberto", 34);
        Person person3 = new Person("Dercy", 55);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        System.out.printf("List size: %d\n", personArrayList.size());

        System.out.println("\nPerson ArrayList:");
        for (Person person : personArrayList){
            System.out.println(person);
        }
    }
}

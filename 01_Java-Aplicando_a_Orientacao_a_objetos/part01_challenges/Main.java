import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n---------------- PERSON CLASS ----------------\n");
        Person  person1 = new Person();
        person1.greeting();


        System.out.print("\n-------------- CALCULATOR CLASS --------------\n");
        Calculator  calculator1 = new Calculator();
        Scanner     scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n1 = scanner.nextDouble();
        System.out.printf("2 * %f = %f\n", n1, calculator1.doubleNumber(n1));

        System.out.print("\n----------------- MUSIC CLASS -----------------\n");
        Music   music1 = new Music();
        double  newRate;
        music1.musicTitle = "My Hood (feat. Stormzy)";
        music1.artist = "RAY BLK";
        music1.releaseYear = 2016;
        newRate = music1.rateMusic();
        music1.rating = music1.calculateRatingAverage(newRate);
        music1.displayTechnicalSheet();

        System.out.print("\n---------------------- CAR CLASS ---------------\n");
        Car car1 = new Car();
        car1.model = "Tiggo 7 Pro Hybrid Max Drive";
        car1.modelYear = 2023;
        car1.color = "Blue";
        car1.calculateCarAge();
        car1.displayTechnicalSheet();

        System.out.print("\n---------------- STUDENT CLASS ----------------\n");
        Student student1 = new Student();

        scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String  name = scanner.next();
        System.out.print("Age: ");
        int     age = scanner.nextInt();
        student1.displayStudentInformation(name, age);

        scanner.close();
    }
}

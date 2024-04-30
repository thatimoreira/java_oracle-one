import java.util.Scanner;

public class Car {
    String  model;
    int     modelYear;
    String  color;
    int     carAge;

    void    displayTechnicalSheet(){
        System.out.printf("Car model........: %s\n", model);
        System.out.printf("Model year.......: %d\n", modelYear);
        System.out.printf("Car color........: %s\n", color);
        if (carAge <= 0){
            System.out.println("Car age..........: New Release!");
        } else {
            System.out.printf("Car age...: %d\n", carAge);
        }
    }

    int calculateCarAge(){
        Scanner scanner;
        int     currentYear;

        scanner = new Scanner(System.in);
        System.out.print("Please, inform the current year: ");
        currentYear = scanner.nextInt();
        scanner.close();
        carAge = currentYear - modelYear;
        return (carAge);
    }
}

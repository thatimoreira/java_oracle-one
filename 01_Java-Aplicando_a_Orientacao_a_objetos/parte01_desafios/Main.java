public class Main {
    public static void main(String[] args) {
        Person  person1 = new Person();
        person1.greeting();

        Calculator calculator1 = new Calculator();
        double n1 = 5.3;
        System.out.printf("2 * %f = %f\n", n1, calculator1.doubleNumber(n1));
    }
}

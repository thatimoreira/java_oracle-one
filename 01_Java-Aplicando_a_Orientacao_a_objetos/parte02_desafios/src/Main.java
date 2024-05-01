import br.com.alura.javafundamentals.part02.BankAccount;
import br.com.alura.javafundamentals.part02.PersonAge;
import br.com.alura.javafundamentals.part02.Product;
import br.com.alura.javafundamentals.part02.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------- BANK ACCOUNT -----------");
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(221374);
        account1.accountHolder = "Thati";
        account1.setBalance(2574.25);
        System.out.printf("Account number: %d\n", account1.getAccountNumber());
        System.out.printf("Account Holder: %s\n", account1.accountHolder);
        System.out.printf("Balance.......: R$%.2f\n", account1.getBalance());

        System.out.println("\n------------- PERSON AGE -----------");
        PersonAge   person1 = new PersonAge();
        PersonAge   person2 = new PersonAge();
        PersonAge   person3 = new PersonAge();
        person1.setName("Flor");
        person1.setAge(-1);
        person1.checkAge(person1.getAge());
        person2.setName("Lucas");
        person2.setAge(32);
        person2.checkAge(person2.getAge());
        person3.setName("Nathalia");
        person3.setAge(17);
        person3.checkAge(person3.getAge());

        System.out.println("\n-------------- PRODUCT --------------");
        Product product1 = new Product();
        product1.setProductName("Chinelo");
        product1.setPrice(25.90);
        product1.showProductDetails();
        System.out.printf("Discounted price: R$%.2f\n", product1.applyDiscount(15));

        System.out.println("\n-------------- STUDENT --------------");
        Student student1 = new Student();
        student1.setName("Marcos de Barros");
        student1.setGrade1(9.8);
        student1.setGrade2(8.75);
        student1.setGrade3(7.5);
        student1.setGrade4(6.9);
        student1.calculateAverage();
        student1.displayStudentInfo();
    }
}

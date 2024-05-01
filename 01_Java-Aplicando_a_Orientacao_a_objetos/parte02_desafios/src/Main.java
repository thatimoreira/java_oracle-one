import br.com.alura.javafundamentals.part02.BankAccount;
import br.com.alura.javafundamentals.part02.PersonAge;

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

        System.out.println("\n------------ PERSON AGE ------------");
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
    }
}

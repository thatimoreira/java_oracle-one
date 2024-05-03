import br.com.alura.course02.part03challenges.models.animal.Cat;
import br.com.alura.course02.part03challenges.models.animal.Dog;
import br.com.alura.course02.part03challenges.models.bankaccount.BankAccount;
import br.com.alura.course02.part03challenges.models.bankaccount.CheckingAccount;
import br.com.alura.course02.part03challenges.models.car.CarModel;
import br.com.alura.course02.part03challenges.models.pimenumbers.PrimeChecker;
import br.com.alura.course02.part03challenges.models.pimenumbers.PrimeGenerator;
import br.com.alura.course02.part03challenges.models.pimenumbers.PrimeNumbers;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------------------------ CAR ------------------------------");
        CarModel tiggo7ProHybMaxDr = new CarModel();
        tiggo7ProHybMaxDr.setModelName("Tiggo 7 Pro Hybrid Max Drive");
        tiggo7ProHybMaxDr.setPrices(215000, 189000, 165000);
        tiggo7ProHybMaxDr.setYears(2022, 2023, 2024);
        tiggo7ProHybMaxDr.showCarDetails();
        tiggo7ProHybMaxDr.setTrunkCapacityLiters(475);
        tiggo7ProHybMaxDr.showTrunkCapacityLiters();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.printf("Lowest price : R$%.2f\n", tiggo7ProHybMaxDr.calculateLowestPrice());
        System.out.printf("Highest price: R$%.2f\n", tiggo7ProHybMaxDr.calculateHighestPrice());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("\n---------------------------- ANIMAL ----------------------------");
        Dog maya = new Dog();
        maya.setAnimalName("Maya");
        maya.setColor("solid yellow");
        maya.setDogBreed("Belgian Shepherd Malinois");
        maya.showAnimalInfos();
        maya.makeSound();
        maya.wagTail();

        System.out.println();

        Cat cleo = new Cat();
        cleo.setAnimalName("Cleo");
        cleo.setColor("black");
        cleo.showAnimalInfos();
        cleo.makeSound();
        cleo.scratchFurniture();

        System.out.println("\n-------------------------------- BANK --------------------------------");
        CheckingAccount account1 = new CheckingAccount();
        account1.setAgencyNumber(2236);
        account1.setAccountNumber(37895234);
        account1.setAccountOwner("John Doe");
        account1.displayAccountInfo();
        account1.withdraw(2000);
        account1.deposit(1500);
        account1.checkBalance();
        account1.withdraw(725);
        account1.chargeMonthlyFee();
        account1.deposit(-1);
        account1.withdraw(-5);
        account1.checkBalance();

        System.out.println("\n--------------------------- PRIME NUMBERS ---------------------------");
        PrimeChecker verify = new PrimeChecker();
        verify.checkIfPrime(5);
        verify.checkIfPrime(21);

        PrimeGenerator generator = new PrimeGenerator();
        int nextPrimeNum = generator.generateNextPrime(23);
        System.out.printf("The next prime number after 23 is %d\n", nextPrimeNum);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimes(21);
    }
}

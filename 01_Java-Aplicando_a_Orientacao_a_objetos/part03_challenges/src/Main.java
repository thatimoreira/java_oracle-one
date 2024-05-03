import br.com.alura.course02.part03challenges.models.animal.Cat;
import br.com.alura.course02.part03challenges.models.animal.Dog;
import br.com.alura.course02.part03challenges.models.car.CarModel;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------------- CAR -------------------");
        CarModel tiggo7ProHybMaxDr = new CarModel();
        tiggo7ProHybMaxDr.setModelName("Tiggo 7 Pro Hybrid Max Drive");
        tiggo7ProHybMaxDr.setPrices(215000, 189000, 165000);
        tiggo7ProHybMaxDr.setYears(2022, 2023, 2024);
        tiggo7ProHybMaxDr.showCarDetails();
        tiggo7ProHybMaxDr.setTrunkCapacityLiters(475);
        tiggo7ProHybMaxDr.showTrunkCapacityLiters();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
        System.out.printf("Lowest price : R$%.2f\n", tiggo7ProHybMaxDr.calculateLowestPrice());
        System.out.printf("Highest price: R$%.2f\n", tiggo7ProHybMaxDr.calculateHighestPrice());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("\n----------------- ANIMAL -----------------");
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
    }
}

import br.com.alura.course02.part03challenges.models.CarModel;

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
    }
}

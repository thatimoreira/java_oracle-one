package br.com.alura.course02.part03challenges.models.car;

public class CarModel extends Car {
    private int trunkCapacityLiters;

    public int getTrunkCapacityLiters() {
        return trunkCapacityLiters;
    }

    public void setTrunkCapacityLiters(int trunkCapacityInLiters) {
        this.trunkCapacityLiters = trunkCapacityInLiters;
    }

    public void showTrunkCapacityLiters(){
        System.out.printf("Trunk capacity ...: %dL\n", trunkCapacityLiters);
    }
}

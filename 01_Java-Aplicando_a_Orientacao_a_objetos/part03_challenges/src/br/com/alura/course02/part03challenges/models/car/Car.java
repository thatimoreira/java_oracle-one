package br.com.alura.course02.part03challenges.models.car;

public class Car {
    protected String    modelName;
    protected double    price1;
    protected double    price2;
    protected double    price3;
    protected int       year1;
    protected int       year2;
    protected int       year3;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrices(double price1, double price2, double price3) {
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
    }

    public void setYears(int year1, int year2, int year3) {
        this.year1 = year1;
        this.year2 = year2;
        this.year3 = year3;
    }

    public double  calculateLowestPrice(){
        double    lowestPrice = price1;

        if (price2 < lowestPrice){
            lowestPrice = price2;
        }
        if (price3 < lowestPrice) {
            lowestPrice = price3;
        }
        return lowestPrice;
    }

    public double  calculateHighestPrice(){
        double    highestPrice = price1;

        if (price2 > highestPrice){
            highestPrice = price2;
        }
        if (price3 > highestPrice){
            highestPrice = price3;
        }
        return highestPrice;
    }

    public void showCarDetails(){
        System.out.printf("Model ..........: %s\n", modelName);
        System.out.printf("Price (%d) .....: R$%.2f\n", year1, price1);
        System.out.printf("Price (%d) .....: R$%.2f\n", year2, price2);
        System.out.printf("Price (%d) .....: R$%.2f\n", year3, price3);
    }
}

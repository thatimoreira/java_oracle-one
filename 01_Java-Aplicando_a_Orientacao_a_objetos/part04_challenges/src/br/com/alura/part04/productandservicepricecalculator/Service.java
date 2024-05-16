package br.com.alura.part04.productandservicepricecalculator;

public class Service implements Sellable {
    String type = "service";
    String  serviceName;
    double  servicePrice;
    int hours;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double   calculateProductTotalPrice(int hours) {
        double  finalPrice;
        double  discount = 0;

        if (hours < 10) {
            return this.servicePrice;
        }
        if (hours < 20){
            discount = 3 / 100;
        } else if (hours < 30) {
            discount = 5 / 100;
        } else if (hours < 48) {
            discount = 7 / 100;
        }
        else
            discount = 10 / 100;
        finalPrice = this.servicePrice * hours * (1 - discount);
        return finalPrice;
    }
}

package br.com.alura.part04.rectangularroomcalculator;

public class RectangularRoomCalculator implements GeometricCalculation{
    private double heightInMeters;
    private double widthInMeters;

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public double getWidthInMeters() {
        return widthInMeters;
    }

    public void setWidthInMeters(double widthInMeters) {
        this.widthInMeters = widthInMeters;
    }

    @Override
    public double calculateArea(double height, double width){
        return this.heightInMeters * this.widthInMeters;
    }

    @Override
    public double calculatePerimeter(double height, double width){
        return  2 * (this.heightInMeters + this.widthInMeters);
    }
}

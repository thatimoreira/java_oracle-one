package br.com.alura.course02.part03challenges.models.animal;

public class Animal {
    protected String    animalName;
    protected String    color;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Animal is making sound...");
    }

    public void showAnimalInfos(){
        System.out.printf("Name ....: %s\n", animalName);
        System.out.printf("Color ...: %s\n", color);
    }
}

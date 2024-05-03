package br.com.alura.course02.part03challenges.models.animal;

public class Dog extends Animal{
    protected String dogBreed;

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof! Woof woof!");
    }

    public void wagTail(){
        System.out.printf("%s is wagging its tail\n", this.animalName);
    }
}

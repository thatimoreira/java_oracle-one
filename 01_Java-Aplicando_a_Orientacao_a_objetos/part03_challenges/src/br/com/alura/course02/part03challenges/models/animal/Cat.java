package br.com.alura.course02.part03challenges.models.animal;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow meow meow");
    }

    public void scratchFurniture(){
        System.out.printf("%s is scratching the furniture\n", this.animalName);
    }
}

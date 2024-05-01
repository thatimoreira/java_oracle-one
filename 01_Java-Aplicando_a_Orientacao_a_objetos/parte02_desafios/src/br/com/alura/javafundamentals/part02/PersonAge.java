package br.com.alura.javafundamentals.part02;

public class PersonAge {
    private String  name;
    private int     age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.printf("Please, inform a valid age for %s.\n", name);
        }
        this.age = age;
    }

    public void checkAge(int age){
        if (age >= 18){
            System.out.printf("%s is of legal age.\n", name);
        } else {
            System.out.printf("%s is underage.\n", name);
        }
    }
}

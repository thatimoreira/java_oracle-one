package br.com.alura.javafundamentals.part02;

public class Student {
    private String  name;
    private double  grade1;
    private double  grade2;
    private double  grade3;
    private double  grade4;
    private double  average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        if (grade1 >= 0){
            this.grade1 = grade1;
        } else {
            System.out.println("Grade 1 not valid! Please, inform a valid grade!");
        }
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        if (grade2 >= 0){
            this.grade2 = grade2;
        } else {
            System.out.println("Grade 2 not valid! Please, inform a valid grade!");
        }
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        if (grade3 >= 0){
            this.grade3 = grade3;
        } else {
            System.out.println("Grade 3 not valid! Please, inform a valid grade!");
        }
    }

    public double getGrade4() {
        return grade4;
    }

    public void setGrade4(double grade4) {
        if (grade4 >= 0){
            this.grade4 = grade4;
        } else {
            System.out.println("Grade 4 not valid! Please, inform a valid grade!");
        }
    }

    public double   calculateAverage(){
        average =  (grade1 + grade2 + grade3 + grade4) / 4;

        return average;
    }

    public void displayStudentInfo(){
        System.out.printf("Name...: %s\n", name);
        System.out.printf("Average: %.2f\n", average);
    }
}

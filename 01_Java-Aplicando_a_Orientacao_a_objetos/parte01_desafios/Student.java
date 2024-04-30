public class Student {
    String  studentName = "";
    int     studentAge = 0;

    void    displayStudentInformation(String name, int age){
        studentName = name;
        studentAge = age;
        System.out.printf("Student name: %s\n", studentName);
        System.out.printf("Student age: %d\n", studentAge);
    }
}

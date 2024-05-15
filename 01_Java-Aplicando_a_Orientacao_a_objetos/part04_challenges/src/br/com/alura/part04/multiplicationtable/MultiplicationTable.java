package br.com.alura.part04.multiplicationtable;

public class MultiplicationTable implements Table {
    public void    showMultiplicationTable(int num){
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}

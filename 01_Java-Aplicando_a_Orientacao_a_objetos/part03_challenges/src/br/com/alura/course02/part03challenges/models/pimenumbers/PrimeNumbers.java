package br.com.alura.course02.part03challenges.models.pimenumbers;

public class PrimeNumbers {
    public boolean checkPrimality(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listPrimes(int upperLimit){
        System.out.printf("Prime numbers up to %d: ", upperLimit);
        int flag = 0;
        for (int i = 2; i <= upperLimit; i++){
            if (checkPrimality(i)){
                if (flag == 1){
                    System.out.print(" , ");
                }
                System.out.print(i);
                flag = 1;
            }
        }
        System.out.println();
    }
}

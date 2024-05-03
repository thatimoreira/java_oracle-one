package br.com.alura.course02.part03challenges.models.pimenumbers;

public class PrimeChecker extends PrimeNumbers{

    public void  checkIfPrime(int num) {
        if (checkPrimality(num)){
            System.out.printf("%d is a prime number\n", num);
        } else {
            System.out.printf("%d is not a prime number\n", num);
        }
    }
}

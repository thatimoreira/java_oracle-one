package br.com.alura.course02.part03challenges.models.pimenumbers;

public class PrimeGenerator extends PrimeNumbers {
    public int generateNextPrime(int lastKnownPrimeNum){
        int nextNum = ++lastKnownPrimeNum;

        while (!checkPrimality(nextNum)){
            nextNum++;
        }
        return nextNum;
    }
}

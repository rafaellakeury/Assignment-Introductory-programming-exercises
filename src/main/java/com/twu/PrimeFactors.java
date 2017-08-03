package main.java.com.twu;

import java.util.ArrayList;

public class PrimeFactors {

    public void generate(int n) {
        System.out.println("Return a list of integers such that the numbers are the factors of N:");

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        int primesMultiply = 1;
        int primesFactor = 2;
        int totalNumber = n;

        while (primesMultiply != totalNumber) {
            if (n % primesFactor == 0) {
                primeNumbers.add(primesFactor);
                primesMultiply *= primesFactor;
                n = n / primesFactor;
            } else {
                primesFactor = getNextPrime(primesFactor);
            }
        }
        System.out.println(primeNumbers.toString());
    }


    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private int getNextPrime(int number) {
        do {
            number++;
        } while (!isPrime(number));

        return number;
    }

}

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
                primesFactor++;
            }
        }
        System.out.println(primeNumbers.toString());
    }

}

package org.example;

public class Main {
    public static void main(String[] args) {
        IsPrimeNumber isPrimeNumber = new IsPrimeNumber();
        System.out.println(isPrimeNumber.isPrime(3));
        System.out.println(isPrimeNumber.isScopePrime(2,20));
    }
}
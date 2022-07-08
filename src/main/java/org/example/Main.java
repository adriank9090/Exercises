package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Convert convert = new Convert();

        int[] numbers = {5, 3, 4, 5, 2};

        Integer val = convert.convertArrayToInteger(numbers);
        System.out.println("Value after conversion Array to Integer: " + val);

        Integer val2 = convert.addOneToInteger(val);
        System.out.println("Second value after adding 1: " + val2);

        int[] val3 = convert.convertIntegerToArray(val2);
        System.out.println("Array list of second value: " + Arrays.toString(val3));














    }
}
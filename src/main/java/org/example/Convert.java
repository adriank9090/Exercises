package org.example;


public class Convert {

    public int convertArrayToInteger(int[] array) {

        Integer sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum * 10 + array[i];
        }
        return sum;
    }

    public int addOneToInteger(Integer a) {
        return a + 1;

    }
    public int[] convertIntegerToArray(Integer example) {
        String temp = example.toString();

        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {

            array = Integer.toString(example).chars().map(operand -> operand -'0').toArray();

        }
        return array;
    }

}



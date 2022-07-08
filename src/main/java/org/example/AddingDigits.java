package org.example;

public class AddingDigits {
    private String number;
    private int sum;

    public AddingDigits(String number) {
        this.number = number;
    }

    public Integer sumNumber() {

        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println("Wynik sumy cyfr liczby: " + sum);

        if (sum >= 10) {
            this.number = String.valueOf(sum);
            sum = 0;
            sumNumber();

        }
        return sum;
    }

}

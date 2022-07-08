package org.example;

import static java.util.Objects.isNull;

public class Palindrom {

    private StringBuilder stringBuilder;
    private String palindrom;

    public Palindrom(String palindrom) {
        this.stringBuilder = new StringBuilder();
        this.palindrom = palindrom;
    }
    public void validatePalindrom() {
        if (isNull(this.palindrom)) {
            throw new IllegalArgumentException("invalid value passed to method");
        }
    }
    public boolean isPalindrom() {
        validatePalindrom();
        stringBuilder.append(palindrom);
        String reversedPalindrom = stringBuilder.reverse().toString();
        if (reversedPalindrom.equals(palindrom)){
            return true;
        }
        return false;
    }
}

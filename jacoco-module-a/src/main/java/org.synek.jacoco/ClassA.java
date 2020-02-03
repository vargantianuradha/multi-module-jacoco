package org.synek.jacoco;

public class ClassA {

    public int stringNumberPow(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty.");
        }

        int x = Integer.parseInt(input);
        return pow(x);
    }

    public String oddOrEven(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty.");
        }

        int x = Integer.parseInt(input);

        if (x % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    private int pow(int x) {
        return x * x;
    }
}

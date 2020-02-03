package org.synek.jacoco;

public class ClassB {

    private final String input;
    private final ClassA a = new ClassA();

    public ClassB(String input) {
        this.input = input;
    }

    public String print() {
        String oddEven = a.oddOrEven(input);
        int pow = a.stringNumberPow(input);
        return String.format("The input is an %s number and it's pow is: %d", oddEven, pow);
    }

}

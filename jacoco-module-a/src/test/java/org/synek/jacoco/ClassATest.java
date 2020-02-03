package org.synek.jacoco;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class ClassATest {

    @Test
    public void stringNumberPow_validNumber() {
        ClassA a = new ClassA();

        Assertions.assertEquals(25, a.stringNumberPow("5"));
    }
}

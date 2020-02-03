package org.synek.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassBTest {

    @Test
    public void print() {
        ClassB b = new ClassB("3");
        Assertions.assertEquals("The input is an odd number and it's pow is: 9", b.print());
    }
}

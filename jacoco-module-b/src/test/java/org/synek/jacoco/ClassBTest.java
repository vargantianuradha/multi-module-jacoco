package org.synek.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class ClassBTest {

    @Test
    public void print() {
        ClassB b = new ClassB("3");
        Assert.assertEquals("The input is an odd number and it's pow is: 9", b.print());
    }
}

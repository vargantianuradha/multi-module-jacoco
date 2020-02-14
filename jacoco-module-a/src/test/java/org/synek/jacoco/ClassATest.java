package org.synek.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class ClassATest {

    @Test
    public void stringNumberPow_validNumber() {
        ClassA a = new ClassA();

        Assert.assertEquals(25, a.stringNumberPow("5"));
    }
}

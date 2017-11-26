package com.epam.additional.tasks.maths.task6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {
    private Prime prime = new Prime();

    @Test
    public void testIsPrime2() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(2));
    }

    @Test
    public void testIsPrime3() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(3));
    }

    @Test
    void testIsPrime4() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(4));
    }

    @Test
    public void testIsPrime5() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(5));
    }

    @Test
    public void testIsPrime7() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(7));
    }
    @Test
    public void testIsPrime12() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(12));
    }

    @Test
    public void testIsPrime13() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(13));
    }

    @Test
    public void testIsPrime15() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(15));
    }

    @Test
    public void testIsPrime17() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(17));
    }
    @Test
    public void testIsPrime22() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(22));
    }

    @Test
    public void testIsPrime27() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(27));
    }

    @Test
    public void testIsPrime31() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(31));
    }

    @Test
    public void testIsPrime33() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(33));
    }

    @Test
    public void testIsPrime55() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(55));
    }

    @Test
    public void testIsPrime73() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(73));
    }

    @Test
    public void testIsPrime102() throws Exception {
        Assert.assertFalse(prime.isPrimeNumber(102));
    }

    @Test
    public void testIsPrime107() throws Exception {
        Assert.assertTrue(prime.isPrimeNumber(107));
    }
}
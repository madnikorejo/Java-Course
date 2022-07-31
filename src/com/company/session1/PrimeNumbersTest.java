package com.company.session1;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumbersTest {

    @Test
    public void isPrime_PrimeNumber_returnsTrue()
    {
        Assert.assertTrue(PrimeNumbers.isPrime(5));
        Assert.assertEquals(false, PrimeNumbers.isPrime(4));
    }

    @Test
    public void add_ValidNumbers_returnsSum()
    {
        int result = PrimeNumbers.add(4,4);
        Assert.assertEquals(8, result);
    }
}

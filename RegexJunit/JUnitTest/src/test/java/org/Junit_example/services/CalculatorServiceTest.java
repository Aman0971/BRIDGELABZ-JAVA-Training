package org.Junit_example.services;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {
    @Test
    public void addTwoNumberTest(){
        int result = CalculatorService.addTwoNumbers(5,6);

        Assert.assertEquals(11,result);
    }
}

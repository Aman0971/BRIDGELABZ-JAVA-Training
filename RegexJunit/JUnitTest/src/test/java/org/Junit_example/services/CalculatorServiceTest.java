package org.Junit_example.services;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {
    int count = 0;

    @Before // ye har ek method se pahle content print krega
    public void beforeEach(){
        System.out.println("Start method execution:");
    }

    @After // ye sbhi method ke baad content print krega
    public void afterEach(){
        System.out.println("Execution stop.");
    }

    @BeforeClass // ye ek hi baar abhi method ke chlne se pahle content print krega
    public static void beforeClass(){
        System.out.println("Start Execution -->");
    }

    @AfterClass // ye bas ek baar content print krega sbhi method ke baad
    public static void afterClass(){
        System.out.println("End ---->");
    }

    @Test
    public void addTwoNumberTest(){
        System.out.println("Adding preformed :");
        int result = CalculatorService.addTwoNumbers(5,6);
        Assert.assertEquals(11,result);
        for(int i =0; i<=20; i++){
            count += i;
        }
        System.out.println("for add Count is :" +count);
    }
    @Test
    public void multiplyTwoNumbersTest(){
        System.out.println("Multiplication performed:");
        int result =  CalculatorService.multiplyTwoNumbers(5,6);
        Assert.assertEquals(30,result);
        for(int i =0; i<=10; i++){
            count += i;
        }
        System.out.println("for multiply Count is :" +count);
    }
}
// for JUnit 4
 // Annotations are :  @BeforeClass,@AfterClass, @Before,@After, @Test
// FLOW OF EXECUTION
   //1-->@BeforeClass
   //2--> fir test class ka ek object banta hai ,
   // matlb ab jo object bna hai vo kissi single @test annotation ke liye
   // 3-->internally , us object se @before, @test and then @After execute hota hai .
   // 4--> ab agr koi aur @test hai to fir object create hoga , nhi to @AfterClass chlega

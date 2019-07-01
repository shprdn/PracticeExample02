package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial fact;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        fact= new Factorial();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        fact=null;

    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public static void tearDownBeforeClass(){
        System.out.println("After class");


    }
    @Test
    public void givenIntegerReturnCorrectMessage(){
        //arange

        //Act
        String result= fact.intoutofrange();

        //Assert
        assertEquals("The factorial of 1 is 1\n" +
                "The factorial of 2 is 2\n" +
                "The factorial of 3 is 6\n" +
                "The factorial of 4 is 24\n" +
                "The factorial of 5 is 120\n" +
                "The factorial of 6 is 720\n" +
                "The factorial of 7 is 5040\n" +
                "The factorial of 8 is 40320\n" +
                "The factorial of 9 is 362880\n" +
                "The factorial of 10 is 3628800\n" +
                "The factorial of 11 is 39916800\n" +
                "The factorial of 12 is 479001600\n" +
                "Factorial of 13 is out of range",result);
    }

    @Test
    public void givenLongReturnCorrectMessage(){
        //arange

        //Act
        String result= fact.longoutofrange();

        //Assert
        assertEquals("The factorial of 1 is 1\n" +
                "The factorial of 2 is 2\n" +
                "The factorial of 3 is 6\n" +
                "The factorial of 4 is 24\n" +
                "The factorial of 5 is 120\n" +
                "The factorial of 6 is 720\n" +
                "The factorial of 7 is 5040\n" +
                "The factorial of 8 is 40320\n" +
                "The factorial of 9 is 362880\n" +
                "The factorial of 10 is 3628800\n" +
                "The factorial of 11 is 39916800\n" +
                "The factorial of 12 is 479001600\n" +
                "The factorial of 13 is 6227020800\n" +
                "The factorial of 14 is 87178291200\n" +
                "The factorial of 15 is 1307674368000\n" +
                "The factorial of 16 is 20922789888000\n" +
                "The factorial of 17 is 355687428096000\n" +
                "The factorial of 18 is 6402373705728000\n" +
                "The factorial of 19 is 121645100408832000\n" +
                "The factorial of 20 is 2432902008176640000\n" +
                "Factorial of 21 is out of range",result);
    }

}
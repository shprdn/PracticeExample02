package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculateTimeTest {
    CalculateTime d;
    @Before
    public void setUp(){

    d = new CalculateTime();
    }
    @After
    public void tearDown(){
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("after class");
    }
    @Test
    public void givenNumberShouldNotReturnError(){
        String result = d.time();
        assertEquals("Mon 01/07/2019" + "Sun 07/07/2019", result);
    }
}
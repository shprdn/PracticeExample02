package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    int[] arr;
    @Before
    public void setUp(){


    }
    @After
    public void tearDown(){
        arr = new int[]{0};
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
    public void givenNumberShouldReturnError(){
        arr = new int[]{5, 4, 3, 2, 1};
        assertEquals("consecutive numbers", ConsecutiveNumbers.checkSeries(arr));
    }
    @Test
    public void givenNumShouldReturnTrue(){
        arr = new int[]{20,21,22,23,24};
        assertEquals("consecutive numbers", ConsecutiveNumbers.checkSeries(arr));
    }
}
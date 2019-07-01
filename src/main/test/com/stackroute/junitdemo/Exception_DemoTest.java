package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class Exception_DemoTest {
    Exception_Demo ed;
    @Before
    public void setUp(){
        ed = new Exception_Demo();
    }
    @After
    public void tearDown(){
        ed = null;
        // arr = new String[][]{};
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
    public void givenNumberShouldReturnNull() {
        String str= ed.multiple(null);
        assertEquals("NullPointerException Caught", str);
    }
    @Test
    public void givenNumberShouldReturnNegative() {
        String str= ed.multiple(5);
        assertEquals("IndexOutOfBoundException caught", str);
    }
    @Test
    public void givenNumberShouldReturnOutOfBound() {
        String str= ed.multiple(-2);
        assertEquals("NegativeArraySizeException caught", str);
    }

}
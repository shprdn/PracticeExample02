package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ThrowExceptionTest {
    ThrowException cb;
    @Before
    public void setUp(){

        cb= new ThrowException();
    }
    @After
    public void tearDown(){
        cb=null;
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
        // arr = new int[]{5, 4, 3, 2, 1};
        String str = cb.check();
        assertEquals("Exception\n" +
                "catch statement\n" +
                "finally",str);
    }


}
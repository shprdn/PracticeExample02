package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentMarksTest {
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
         arr = new int[]{211, 32, 54, 54, 12};
        assertNotEquals("grade is in the range of 0-100", StudentMarks.checkGrade(5, arr));
    }
    @Test
    public void givenNumShouldReturnTrue(){
        arr = new int[]{20,45,34,76,54};
        assertEquals("grade is in the range of 0-100", StudentMarks.checkGrade(5, arr));
    }
    @Test
    public void givenNumShouldReturnNull(){
        arr=new int[]{0};
        assertEquals("error", StudentMarks.checkGrade(5,arr));

    }


}
package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelTest {
    String[] arr1,arr2;
    @Before
    public void setUp(){
    }
    @After
    public void tearDown(){
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
    public void givenNumberShouldReturnError(){
        arr1 = new String[]{"India","United States","Germany","Egypt","czechoslovakia"};
      //  arr2 = new String[]{"Ind","ntd Stats","Grmny","gypt","czchslvk"};
        assertEquals("Place Name without Vowels:0Ind\n" +
                "Place Name without Vowels:1Untd Stts\n" +
                "Place Name without Vowels:2Grmny\n" +
                "Place Name without Vowels:3Egypt\n" +
                "Place Name without Vowels:4czchslvk\n",RemoveVowel.remove(arr1));
    }


}
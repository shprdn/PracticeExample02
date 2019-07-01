package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    int[][] arr1;
    int[][] arr2;
        MatrixAddition add;
    @Before
    public void setUp(){
        add = new MatrixAddition();
      //  MatrixAddition add;
    }
    @After
    public void tearDown(){
      //  arr1 = new int[][]{{0}};
       // arr2 = new int[][]{{0}};
        add = null;
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
        arr1 = new int[][]{{1, 2}, {3, 4}, {5,6}};
        arr2 = new int[][]{{7,8},{9,10},{11,12}};
     //   add = new int[][]{{8,10},{12,14},{16,18}};
        String str = add.addition(3,2,arr1,arr2);
        //assertArrayEquals(add,MatrixAddition.addition(3,2,arr1,arr2));
        assertEquals("8 10 \n12 14 \n16 18", str);
    }

}
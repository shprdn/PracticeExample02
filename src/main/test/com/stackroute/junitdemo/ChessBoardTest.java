package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard cb;
    @Before
    public void setUp(){

        cb= new ChessBoard();
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
        String str = cb.display();
        assertEquals("WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW",str);
    }

}
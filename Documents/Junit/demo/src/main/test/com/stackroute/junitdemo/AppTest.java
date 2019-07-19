package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App appObj;

    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
         appObj= new App();
    }

    @After
    public void tearDown(){
        System.out.println("After");
        appObj=null;
    }

    @BeforeClass
    public static void tearDownAfterClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void setUPBeforeClass(){
        System.out.println("Afterclass");

    }

    @Test
    public void givenTwoNullShouldReturnConcatinatedUpperString(){

    //act
    String result=appObj.concatAndConvertString(null, null);
    //assert
    assertEquals("Null not allowed",result);
    }


    public void givenTwoNullShouldReturnErrorMessage(){
        //arrange
        App appObj= new App();
        //act
        String result=appObj.concatAndConvertString(null, null);
        //assert
        assertEquals("Null not allowed",null);
    }
}
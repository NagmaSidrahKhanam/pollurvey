package com.stackroute.junitwork;
import static org.junit.Assert.*;
import org.junit.*;

public class MemberTest {


    Member app;
    Member.MemberVariable app2;

    @BeforeClass
    public static void setUpOnce() {


    }

    @AfterClass
    public static void teardownOnce() {


    }

    @Before
    public void setUp() {

        app = new Member();
        app2 = app.new MemberVariable();
    }

    @After
    public void tearDown() {

        app = null;
    }

    @Test
    public void FirstPalindromeSuccess() {
        //Arrange
        String[] expectedValue = {"Harry Potter", "30", "2500.3"};

        //Act
        String[] actualValue = app2.isMember("Harry Potter", 30, 2500.3);
        //Assert
        assertArrayEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }
}

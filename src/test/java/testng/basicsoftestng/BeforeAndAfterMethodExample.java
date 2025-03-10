package testng.basicsoftestng;

import org.testng.annotations.*;

public class BeforeAndAfterMethodExample {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("method close");
    }

    @Test
    public void testCase1(){
        System.out.println("test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("test case 2");
    }

    @Test
    public void testCase3(){
        System.out.println("test case 3");
    }

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class");
    }

}

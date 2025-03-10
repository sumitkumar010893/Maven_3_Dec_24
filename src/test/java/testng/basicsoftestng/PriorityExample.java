package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.listeners.RetryExample;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }

    @Test(priority = -2)
    public void testCaseF(){
        Assert.assertTrue(false);
        System.out.println("Test Case F");
    }

    @Test(priority = 3)
    public void testCaseD(){
        System.out.println("Test Case D");
    }

    @Test(priority = 4, groups = {"smoke"})
    public void testCaseC(){
        System.out.println("Test Case C");
    }

    @Test
    public void testCaseA(){
        System.out.println("Test Case A");
    }

    @Test(priority = 5, groups = {"smoke"})
    public void testCaseB(){
        System.out.println("Test Case B");
    }
}

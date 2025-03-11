package testng.basicsoftestng;

import org.testng.annotations.Test;

public class TestNGInvocation {

    @Test(invocationCount = 50, invocationTimeOut = 10)
    public void repeatingTestCaseExmple(){
        System.out.println("Repeating Test Case Example");
        System.out.println("Good evening");
    }
}

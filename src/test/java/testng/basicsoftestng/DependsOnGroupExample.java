package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"smoke"})
    public void loginFunctionality(){
        Assert.assertTrue(false);
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("Hpme Page Validation");
    }


    @Test(description = "Verify new account creation with valid test data")
    public void onboarding(){
        System.out.println("Onboarding");
    }
}

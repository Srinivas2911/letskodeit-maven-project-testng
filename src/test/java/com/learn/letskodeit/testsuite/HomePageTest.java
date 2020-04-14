package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
HomePage homePage = new HomePage();

    @Test (priority = 0, groups = {"sanity", })
    public void verifyThatPracticeLinkIsDisplayed (){
        homePage.practiceLinkisDisplayed();
            }
    @Test (priority = 1, groups = {"sanity", "smoke"})
    public void verifyThatLoginLinkIsDisplayed(){
        homePage.loginLinkIsDisplayed();
    }
    @Test (priority = 2, groups = {"smoke", "regression"})
    public void verifyThatSignUpLinkIsDisplayed(){
        homePage.signUpLinkIsDisplayed();
    }
}

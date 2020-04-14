package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.pages.MyCoursesPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyCoursesPage myCoursesPage = new MyCoursesPage();

    @Test(priority = 0, groups = {"sanity", "smoke"})
    public void verifyThatLoginPageWelcomeTextisDisplayed() {
        homePage.clickOnLoginLink();
        loginPage.LoginPageTextIsDisplayed();
    }

    @Test(priority = 1, groups = {"smoke", "regression"})
    public void verifyThatUserIsAbleToLogInSuccessfully() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailField("Roger123@gmail.com");
        loginPage.enterPasswordField("Password123");
        loginPage.clickOnLoginButton();
        myCoursesPage.myCourseTextIsDisplayed();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(myCoursesPage.getMyCourseText(), "My Courses");
    }

    @Test(priority = 2, groups = {"smoke", "regression"})
    public void verifyThatUserShouldNotToLogWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailField("Roger123@gmail.com");
        loginPage.enterPasswordField("Password12356677");
        loginPage.clickOnLoginButton();
        loginPage.getLoginErrorAlert();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(loginPage.getLoginErrorAlert().contains("Invalid email or password."));

    }
}

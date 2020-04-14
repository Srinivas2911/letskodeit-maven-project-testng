package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By welcomeText = By.className("headline");
    By practiceLink = By.partialLinkText("Practi");
    By loginLink = By.partialLinkText("Login");
    By signUpLink = By.xpath("//a[@id='header-sign-up-btn']");

    public void practiceLinkisDisplayed() {
        verifyThatElementIsDisplayed(practiceLink);
    }

    public void loginLinkIsDisplayed() {
        verifyThatElementIsDisplayed(loginLink);
    }

    public void signUpLinkIsDisplayed() {
        verifyThatElementIsDisplayed(signUpLink);
    }

    public void clickOnPracticeLink() {
        clickOnElement(practiceLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnSignUplink() {
        clickOnElement(signUpLink);
    }

}

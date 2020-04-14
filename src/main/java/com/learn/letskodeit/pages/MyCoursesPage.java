package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class MyCoursesPage extends Utility {

//    By myCourseText = By.partialLinkText("My Cours");
    By myCourseText = By.xpath("//a[contains(text(),'My Courses')]");


    public void myCourseTextIsDisplayed (){
        verifyThatTextIsDisplayed(myCourseText, "      My Courses");
    }

    public String getMyCourseText(){
       return getTextFromElement(myCourseText);
    }
}

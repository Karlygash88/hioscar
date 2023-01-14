package com.hioscar.pages;

import com.hioscar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OscarHomePage {

    public OscarHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Find a Doctor")
    public WebElement findDoctorButton;

    public void clickFindDoctorButton() {
        findDoctorButton.click();
    }
}

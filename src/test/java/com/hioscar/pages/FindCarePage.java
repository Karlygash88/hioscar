package com.hioscar.pages;

import com.hioscar.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindCarePage{

    public FindCarePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Find a Doctor")
    public WebElement findDoctorButton;

    public void clickFindDoctorButton() {
        findDoctorButton.click();
    }

    @FindBy(xpath = "//span[.='Search in-network providers, facilities, and drugs']")
    public WebElement findCarePageTitle;

    @FindBy(xpath = "//input[@aria-labelledby='search-label']")
    public WebElement searchInput;

    @FindBy(xpath = "//a[@class='h-H1cLlKOxb6RDzB78XkAqp o-container']")
    public List<WebElement> providersList;

    @FindBy(className = "h-CbHcqk580meKCwsgkVhZ2 o-item")
    public List<WebElement> hospitalNames;

    @FindBy(xpath = "//div[@class='h-17zLLgi3sV6Kzs6xByYF3O o-itemContainer']")
    public List<WebElement> hospitalsList;

    @FindBy(xpath = "//span[.='No results. Try another search.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//h1")
    public WebElement title;


    public void searchForPrimaryCare() {
        searchInput.sendKeys("Primary care" + Keys.ENTER);
    }

    public void searchForHospital() {
        searchInput.sendKeys("Hospital" + Keys.ENTER);

    }

    public void searchForSpecificCondition() {
        searchInput.sendKeys("Drugs" + Keys.ENTER);
    }

    public void searchForInvalidKeyword() {
        searchInput.sendKeys("Pizza" + Keys.ENTER);
    }


}

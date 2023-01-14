package com.hioscar.pages;

import com.hioscar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CareOptionsPage {
    public CareOptionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Search network'])[1]")
    public WebElement searchNetworkButton;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[1]")
    public WebElement coverageYearDropdown;

    @FindBy(xpath = "//div[@aria-label='2023']")
    public WebElement coverageYearOption;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[2]")
    public WebElement coverageAccessDropdown;

    @FindBy(xpath = "//ul/li[@class='DropdownOverlayItem_unselectable__Pa5zw']")
    public List<WebElement> coverageAccessOptions;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")
    public WebElement networkPartnerDropdown;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")
    public WebElement coverageAreaDropdown;

    @FindBy(xpath = "//div[@class='DropdownOverlayItem_item__36OV6 DropdownOverlayItem_item_size-small__3eMNL']")
    public List<WebElement> coverageAreaOptions;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButton;

    public void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void selectOptionFromDropdown(List<WebElement> options, int optionOrder) {
        options.get(optionOrder - 1).click();
    }


}

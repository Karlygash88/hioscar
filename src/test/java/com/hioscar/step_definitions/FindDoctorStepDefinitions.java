package com.hioscar.step_definitions;

import com.hioscar.pages.CareOptionsPage;
import com.hioscar.pages.FindCarePage;
import com.hioscar.pages.OscarHomePage;
import com.hioscar.utilities.ConfigReader;
import com.hioscar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FindDoctorStepDefinitions {

    FindCarePage findCarePage = new FindCarePage();
    CareOptionsPage careOptionsPage = new CareOptionsPage();

    OscarHomePage homePage = new OscarHomePage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User clicks Find Doctor button")
    public void user_clicks_find_doctor_button() {
        homePage.clickFindDoctorButton();
    }

    @Then("User clicks on Search Network button")
    public void user_clicks_on_search_network_button() {
        careOptionsPage.click(careOptionsPage.searchNetworkButton);
    }

    @Then("User selects coverage year")
    public void user_selects_coverage_year() {
        careOptionsPage.click(careOptionsPage.coverageYearDropdown);
        careOptionsPage.click(careOptionsPage.coverageYearOption);
    }

    @Then("User selects coverage access")
    public void user_selects_coverage_access() {
        careOptionsPage.click(careOptionsPage.coverageAccessDropdown);
        careOptionsPage.selectOptionFromDropdown(careOptionsPage.coverageAccessOptions, 1);

    }

    @Then("User selects coverage area")
    public void user_selects_coverage_area() {
        careOptionsPage.click(careOptionsPage.coverageAreaDropdown);
        careOptionsPage.selectOptionFromDropdown(careOptionsPage.coverageAreaOptions, 1);

    }

    @Then("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        careOptionsPage.click(careOptionsPage.continueButton);

    }

    @Then("User should land on find care page")
    public void user_should_land_on_find_care_page() {
        Assert.assertTrue(findCarePage.findCarePageTitle.getText().contains("Search in-network providers, facilities, and drugs"));
    }

    @Given("User searches for primary care")
    public void user_searches_for_primary_care() {
        findCarePage.searchForPrimaryCare();

    }

    @Then("Primary care providers should be listed")
    public void primary_care_providers_should_be_listed() {
        Assert.assertTrue(!findCarePage.providersList.isEmpty());
    }


    @Given("User searches for hospital")
    public void user_searches_for_hospital() {
        findCarePage.searchForHospital();
    }

    @Then("Hospitals should be listed")
    public void hospitals_should_be_listed() {
        Assert.assertTrue(!findCarePage.hospitalsList.isEmpty());

    }


    @Given("User searches for specific condition")
    public void user_searches_for_specific_condition() {
        findCarePage.searchForSpecificCondition();
    }

    @Then("All information related to the condition should be listed")
    public void all_information_related_to_the_condition_should_be_listed() {
        Assert.assertTrue(findCarePage.title.getText().contains("Drug"));

    }

    @Given("User searches for invalid keyword")
    public void user_searches_for_invalid_keyword() {
        findCarePage.searchForInvalidKeyword();
    }

    @Then("Error message should appear")
    public void error_message_should_appear() {
        Assert.assertEquals("No results. Try another search.", findCarePage.errorMessage.getText());

    }


}

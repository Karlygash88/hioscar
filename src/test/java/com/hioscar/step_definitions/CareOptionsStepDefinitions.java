package com.hioscar.step_definitions;

import com.hioscar.pages.CareOptionsPage;
import io.cucumber.java.en.Then;

public class CareOptionsStepDefinitions {

    CareOptionsPage careOptionsPage = new CareOptionsPage();

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

}

package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.unilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


;


public class Google_stepDefinitions {
    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle= "Google";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
    @Given("user is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");


    }

    @When("User searches for {string}")
    public void userSearchesFor(String arg0) {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys(arg0+ Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = arg0;

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}



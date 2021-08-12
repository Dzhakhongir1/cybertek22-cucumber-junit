package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyPage;
import com.cybertek.unilities.ConfigurationReader;
import com.cybertek.unilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Etsy_stepDefinitions {
    EtsyPage page = new EtsyPage();

    @Given("user is on etsy landing page")
    public void user_is_on_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);


    }
    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @When("user types Wooden Spoon in the search bar")
    public void user_types_wooden_spoon_in_the_search_bar() {

        page.searchBAr.sendKeys("Wooden spoon");
    }
    @When("user clicks to search button")
    public void user_clicks_to_search_button() {
        page.searchButton.click();
    }
    @Then("user sees title is Wooden spoon | Etsy")
    public void user_sees_title_is_wooden_spoon_etsy() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="wooden spoon | Etsy";
        Assert.assertEquals(expectedTitle,actualTitle);
    }



}

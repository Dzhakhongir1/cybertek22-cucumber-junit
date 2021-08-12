package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.unilities.ConfigurationReader;
import com.cybertek.unilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Wiki_StepDefinitions {
    WikiSearchPage page = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        page.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        page.searchButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expected ="Steve Jobs - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actualTitle);

    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        page.searchBox.sendKeys(arg0);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {

        String expected =arg0+" - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actualTitle);


    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        String expectedHeader = arg0;
        String actual = page.mainHeader.getText();
        Assert.assertEquals(expectedHeader,actual);
    }
}

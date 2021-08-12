package com.cybertek.step_definitions;

import com.cybertek.pages.DropDwonPAge;
import com.cybertek.pages.LibraryPages;
import com.cybertek.unilities.BrowserUtils;
import com.cybertek.unilities.ConfigurationReader;
import com.cybertek.unilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_stepDefinitions {

    LibraryPages  pages = new LibraryPages();


    @Given("User is on the dropdowns page of practice toll")
    public void user_is_on_the_dropdowns_page_of_practice_toll() {
      String url= "http://practice.cybertekschool.com/dropdown";
      Driver.getDriver().get(url);
    }
    @Then("hen user should see below onfo in month dropdown")
    public void hen_user_should_see_below_onfo_in_month_dropdown(List<String> expectedTest) {
        DropDwonPAge pAge = new DropDwonPAge();
        Select select = new Select(pAge.month);
        List <String> listOfmonth= BrowserUtils.getElementsText(select.getOptions());

        Assert.assertEquals(expectedTest,listOfmonth);
    }

    @Given("user is on the log in page of library app")
    public void user_is_on_the_log_in_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username password as below")
    public void user_enters_username_password_as_below(Map<String,String>logInInfo) {
    pages.username.sendKeys(logInInfo.get("username"));
    pages.password.sendKeys(logInInfo.get("password"));
    pages.logInButton.click();

    }
    @Then("user should see title something")
    public void user_should_see_title_something() {

    }

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String>listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);




















    }

}

package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBarePage;
import com.cybertek.unilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class SmartBear_StepDef {

    SmartBarePage  page = new SmartBarePage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
       String url = "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx";
       Driver.getDriver().get(url);
        page.login();
    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        page.orderButton.click();
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(page.dropdown);
        page.dropdown.click();
        select.selectByVisibleText(string);
    }
    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String arg0) {
        page.quantity.sendKeys(arg0);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        page.name.sendKeys(string);

    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        page.street.sendKeys(string);

    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        page.city.sendKeys(string);

    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        page.state.sendKeys(string);
    }
    @And("User enters {string}")
    public void userEnters(String arg0) {
        page.zipcode.sendKeys(arg0);
    }

    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        page.visatype.click();
    }
    @And("User enters {string} to card number")
    public void userEntersToCardNumber(String arg0) {
        page.cardNum.sendKeys(arg0);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        page.expDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        page.proccesButton.click();
        page.viewAllorder.click();
    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String arg0) {
        Assert.assertTrue(page.names(arg0).isDisplayed());
    }


}

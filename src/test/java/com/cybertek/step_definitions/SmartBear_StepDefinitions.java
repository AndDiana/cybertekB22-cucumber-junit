package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearOrder;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefinitions {

    SmartBearOrder smartBearOrder = new SmartBearOrder();
    Select select;

    @Given("User is on SmartBear login page")
    public void user_is_on_smart_bear_login_page() {

        String url = ConfigurationReader.getProperty("smartBearURl");
        Driver.getDriver().get(url);


    }
    @When("User enters correct username and password")
    public void user_enters_correct_username_and_password() {

        String user = ConfigurationReader.getProperty("smartBearUserName");
        String pass = ConfigurationReader.getProperty("smartBearPass");
        smartBearOrder.usernameField.sendKeys(user);
        smartBearOrder.passwordField.sendKeys(pass);
        smartBearOrder.loginButton.click();
    }

    @When("User navigates to Order page")
    public void user_navigates_to_order_page() {
       smartBearOrder.orderTab.click();
    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {

        String productName  = string;
        select = new Select(smartBearOrder.productSelecter);
        select.selectByValue(productName);

    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {

        String quantity = string;
        smartBearOrder.quantity.sendKeys(quantity);

    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {

        String customerName = string;
        smartBearOrder.fullName.sendKeys(customerName);

    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {

        String street = string;
        smartBearOrder.streetName.sendKeys(street);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {

        String city = string;
        smartBearOrder.city.sendKeys(city);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {

        String state = string;
        smartBearOrder.state.sendKeys(state);

    }

    @When("User enters {string} for zipCode")
    public void userEntersForZipCode(String string) {

        String zipCode = string;
        smartBearOrder.zipCode.sendKeys(zipCode);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {

        String creditCardType = string;
        Driver.getDriver().findElement(By.xpath("//input[@value = '" + creditCardType + "']")).click();

    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {

        String cardNumber = string;
        smartBearOrder.creditCardNumber.sendKeys(cardNumber);
    }


    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {

        String expiration = string;
        smartBearOrder.creditCardExpiration.sendKeys(string);

    }

    @When("User clicks process button")
    public void user_clicks_process_button() {

        smartBearOrder.processButton.click();

    }


    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String string) {

        smartBearOrder.viewAllOrdersTab.click();
        String expectedName = string;

        for (WebElement each : smartBearOrder.allNames) {
            Assert.assertTrue(each.getText().equals(expectedName));
            return;
        }

        Driver.closeDriver();

    }



}

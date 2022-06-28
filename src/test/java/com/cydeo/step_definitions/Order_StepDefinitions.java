package com.cydeo.step_definitions;

import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    OrderPage orderPage = new OrderPage();


    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        webTableLoginPage.login();
        orderPage.order.click();


    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        /*Alert alert = Driver.getDriver().switchTo().alert();
        alert.dismiss();
        BrowserUtils.waitFor(1);
        alert.dismiss();*/
        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }
   /* @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
        orderPage.quantityInputBox.sendKeys(string);

    }*/
   @And("user enters quantity {int}")
   public void userEntersQuantity(int arg0) {
       //orderPage.quantityInputBox.clear();
       orderPage.quantityInputBox.sendKeys(Keys.BACK_SPACE);
       orderPage.quantityInputBox.sendKeys(String.valueOf(arg0));
   }


    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.nameBox.sendKeys(string);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.streetBox.sendKeys(string);

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.cityBox.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.stateBox.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.zipBox.sendKeys(string);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {

       /* List<WebElement> cardTypes = orderPage.cardType;

        for (WebElement cardType : cardTypes) {
            if(cardType.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                cardType.click();
            }
        }*/

        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardType);



    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
            orderPage.cardNumberBox.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.cardExpDateBox.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
            String expectedName = string;
            String actualName = orderPage.firstRowNameBox.getText();

        Assert.assertEquals(expectedName,actualName);
    }


}

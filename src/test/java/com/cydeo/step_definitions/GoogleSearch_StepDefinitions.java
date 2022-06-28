package com.cydeo.step_definitions;


import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {
    GoogleSearchPage page = new GoogleSearchPage();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }


    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        page.agreeButton.click();
        page.searchBox.sendKeys("apple", Keys.ENTER);


    }
   @Then("user sees apple is in the google title")
    public void user_sees_apple_is_in_the_google_title() {
       String expectedTitle = "apple - Google Search";
       String actualTitle = Driver.getDriver().getTitle();
       Assert.assertEquals("Expected title not match!",expectedTitle,actualTitle);
    }

    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String searchKeyword) {
        page.searchBox.sendKeys(searchKeyword,Keys.ENTER);
    }

    @Then("user sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String string) {
        String expectedTitle = string+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Expected title not match!",expectedTitle,actualTitle);

    }
    @Then("User should see {string} in the result")
    public void userShouldSeeInTheResult(String expectedCapital) {
        String actualValue = page.getCapital();
        Assert.assertEquals(expectedCapital,actualValue);
    }

    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String string) {
        page.agreeButton.click();
        page.searchBox.sendKeys(string+Keys.ENTER);
    }
}
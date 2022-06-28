package com.cydeo.step_definitions;

import com.cydeo.pages.CloudTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTables_StepDefinitions {
    CloudTablePage cloudTablePage = new CloudTablePage();

    String firstName;
    String lastName;

    @Given("User is on cloudTables homepage")
    public void user_is_on_cloud_tables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));

    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        cloudTablePage.newButton.click();


    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String string) {

        cloudTablePage.firstNameBox.sendKeys(string);
        this.firstName=string;
    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String string) {
        cloudTablePage.lastNameBox.sendKeys(string);
            this.lastName=string;
    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String string) {
        cloudTablePage.positionBox.sendKeys(string);

    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String string) {
    cloudTablePage.salaryBox.sendKeys(string);
    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        cloudTablePage.createButton.click();

    }
    @Then("User should be able to find person at the search box")
    public void user_should_be_able_to_find_person_at_the_search_box() {
        cloudTablePage.searchBox.clear();
        cloudTablePage.searchBox.sendKeys(firstName+ " "+ lastName);
        Assert.assertTrue(cloudTablePage.getNewPerson(firstName,lastName).isDisplayed());

    }

    @And("User should be able to delete the person created")
    public void userShouldBeAbleToDeleteThePersonCreated() {
        cloudTablePage.getNewPerson(firstName,lastName).click();
        cloudTablePage.deletebutton.click();
        cloudTablePage.deleteConfirmButton.click();
        cloudTablePage.searchBox.sendKeys(firstName+" "+lastName);
        Assert.assertTrue(cloudTablePage.noPersonMessage.isDisplayed());


    }
}

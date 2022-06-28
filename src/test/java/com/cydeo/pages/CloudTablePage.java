package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePage {

    public CloudTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameBox;


    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameBox;



    @FindBy(id = "DTE_Field_position")
    public WebElement positionBox;



    @FindBy(id = "DTE_Field_office")
    public WebElement officeBox;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extensionBox;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDateBox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;

    public WebElement getNewPerson(String firstName, String lastName){
        return Driver.getDriver().findElement(By.xpath("//td[.='"+firstName+" "+lastName+"']"));
    }

    @FindBy(xpath = "//button/span[.='Delete']")
    public WebElement deletebutton;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "//td[@valign='top']")
    public WebElement noPersonMessage;

    }




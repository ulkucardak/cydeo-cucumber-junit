package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInputBox;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipBox;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressButton;

    @FindBy(name = "card")
    public List<WebElement> cardType;



    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNumberBox;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardExpDateBox;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    @FindBy(xpath = "(//tr/td)[1]")
    public WebElement firstRowNameBox;
}

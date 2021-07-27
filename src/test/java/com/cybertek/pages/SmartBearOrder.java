package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearOrder {

    public SmartBearOrder() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameField;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(xpath = "//ul[@id ='ctl00_menu']//li[3]")
    public WebElement orderTab;

    @FindBy(xpath = "//select[@id = 'ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productSelecter;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtName']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement streetName;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement creditCardSelector;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement creditCardNumber;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement creditCardExpiration;

    @FindBy(xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement processButton;

    @FindBy(xpath = "//ul[@id ='ctl00_menu']//li[1]")
    public WebElement viewAllOrdersTab;

    @FindBy(xpath = "//table[@style ='border-width:0px;width:100%;']//tr//td[2]")
    public List<WebElement> allNames;


}

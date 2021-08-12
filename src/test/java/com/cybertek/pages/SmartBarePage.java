package com.cybertek.pages;

import com.cybertek.unilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBarePage {
    public SmartBarePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement dropdown;

   @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement username;

   @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement password;

   @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
   public WebElement sighnInbutton;

   @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
   public WebElement quantity;


   @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
   public WebElement name;

   @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
   public WebElement street;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement visatype;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNum;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement proccesButton;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllorder;

    @FindBy(xpath = "//tr[ *[ text() = 'John Wick' ] ]/td[.='John Wick']")
    public WebElement orderStatus;


   public void login(){
       username.sendKeys("Tester");
       password.sendKeys("test");
       sighnInbutton.click();
   }

    public WebElement names(String name){
       WebElement names= Driver.getDriver().findElement(By.xpath("//tr[ *[ text() = '"+name+"' ] ]/td[.='"+name+"']"));
       return  names;
    }

}

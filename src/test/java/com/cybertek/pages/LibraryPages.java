package com.cybertek.pages;

import com.cybertek.unilities.ConfigurationReader;
import com.cybertek.unilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPages {
    public LibraryPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement logInButton;

    /*
    Log in method with specific user name and password
     */
    public void login(){
        username.sendKeys("Username");
        password.sendKeys("password");
        logInButton.click();
    }
    public void loginWithAdmin(){
        username.sendKeys("Username");
        password.sendKeys("password");
        logInButton.click();
    }
    public void loginWithWithConfig(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        logInButton.click();
    }
    public void login(String Username,String Password){
        username.sendKeys(Username);
        password.sendKeys(Password);
        logInButton.click();

    }
}

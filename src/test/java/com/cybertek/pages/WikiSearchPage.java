package com.cybertek.pages;

import com.cybertek.unilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.WeakHashMap;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "searchInput")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement searchButton;

    @FindBy(id="firstHeading")
    public WebElement mainHeader;



}

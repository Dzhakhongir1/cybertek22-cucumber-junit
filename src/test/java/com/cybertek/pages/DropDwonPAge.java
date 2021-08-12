package com.cybertek.pages;

import com.cybertek.unilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDwonPAge {
    public DropDwonPAge(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "month")
    public WebElement month;

}

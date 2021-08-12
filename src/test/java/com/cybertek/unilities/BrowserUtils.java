package com.cybertek.unilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /*
       method that will accept integer
       wait for given seconds duration
        */
    public static void sleep(int seconds)  {
        seconds*=1000;

        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Something happened ");
        }
    }

    public static List<String> getElementsText(List<WebElement> webElements){
        List <String> list = new ArrayList<>();
        for (WebElement each : webElements) {
            list.add(each.getText());
        }

        return list;
    }



}

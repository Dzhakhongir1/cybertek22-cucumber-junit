package com.cybertek.step_definitions;

import com.cybertek.unilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // import from io cucumber java
    @Before(value = "@login", order = 1)
    public void setupScenario(){
        System.out.println("__Setting up browser with further details");
    }

    @After
    public void tearDrownScenario(Scenario scenario) {

        if (scenario.isFailed()){
            byte [] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();


    }



}

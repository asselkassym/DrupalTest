package com.express_scripts_corporate.step_definitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
        System.out.println("AFTER");
    }









//    //this hook will work only for scenarios with a tag @storemanager
//    //also it will run before default hook, because of priority
//    @Before(value="@storemanager", order=1)
//    public void setupForStoreManager(Scenario scenario){
//        System.out.println("BEFORE FOR STORE MANAGER");
//    }
//
//
//    @After(value="@storemanager", order=1)
//    public void tearDownForStoreManager(){
//        System.out.println("AFTER FOR STORE MANAGER");
//    }
}

package com.express_scripts_corporate.pages;

import com.utilities.BasePage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Visitor_Main extends BasePage{
    public void goToLandingPage() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
        Thread.sleep(5000);
    }
}

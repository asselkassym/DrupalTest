package com.express_scripts_corporate.step_definitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.util.Map;

public class visitor_main_stepDefs {
    Pages pages = new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() throws InterruptedException {
        pages.visitorMain().goToLandingPage();
    }
}


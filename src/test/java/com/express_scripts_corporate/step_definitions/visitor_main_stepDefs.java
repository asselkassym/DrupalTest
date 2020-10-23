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

    @Given("validate user is on landing page")
    public void validate_user_is_on_the_landing_page() throws InterruptedException {
        String pageTitleExpected = "Homepage | Express Scripts";
        String pageTitleActual = pages.visitorMain().getPageTitle();
        Assert.assertEquals(pageTitleExpected, pageTitleActual);
    }
    @When("click on <{string}> tab")
    public void click_on_tab(String tabTitle) {
        pages.visitorMain().navigateToModule(tabTitle);
    }

    @Then("validate <{string}> tab is displayed")
    public void validate_tab_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}


package com.advantageonlineshopping.automation.stepdefinitions;

import com.advantageonlineshopping.automation.models.Data;
import com.advantageonlineshopping.automation.steps.HomeLoginStep;
import com.advantageonlineshopping.automation.steps.HomeStep;
import com.advantageonlineshopping.automation.steps.CreateNewAccountStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    CreateNewAccountStep createNewAccountStep;
    @Steps
    HomeLoginStep homeLoginStep;

    @Given("^enter the page to register$")
    public void enterThePageToRegister() throws InterruptedException {
        homeStep.openBrowser();
        Thread.sleep(3000);
        homeStep.selectCreateNewAccount();
        Thread.sleep(5000);
    }

    @When("^direct the form$")
    public void directTheForm(List<Data> dataList) throws InterruptedException {
       createNewAccountStep.registerUser(dataList.get(0));
    }

    @Then("^should see him username in the portal$")
    public void shouldSeeHimUsernameInThePortal(List<Data> dataList) throws InterruptedException {
        createNewAccountStep.messageAccountFailed();
        Thread.sleep(5000);
        homeLoginStep.shouldUserNamePortal(dataList.get(0));
    }

}

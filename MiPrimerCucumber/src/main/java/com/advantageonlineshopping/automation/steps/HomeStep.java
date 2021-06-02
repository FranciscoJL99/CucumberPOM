package com.advantageonlineshopping.automation.steps;

import com.advantageonlineshopping.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void selectCreateNewAccount(){
        homePage.clickUserButton();
        homePage.waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(homePage.creteNewAccountOption));
        homePage.clickCreteNewAccountOption();
    }
}

package com.advantageonlineshopping.automation.steps;

import com.advantageonlineshopping.automation.models.Data;
import com.advantageonlineshopping.automation.pageobjects.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateNewAccountStep {
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

    @Step
    public void registerUser(Data data){
        createNewAccountPage.setUserName(data.getUserName());
        createNewAccountPage.setEmail(data.getEmail());
        createNewAccountPage.setPassword(data.getPassword());
        createNewAccountPage.setConfirmPassword(data.getPassword());
        createNewAccountPage.clickCheckIAgree();
        createNewAccountPage.clickRegisterButton();
    }

    @Step
    public void messageAccountFailed(){
        createNewAccountPage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(createNewAccountPage.messageInvalidAccount));
    }
}

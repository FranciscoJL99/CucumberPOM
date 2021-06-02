package com.advantageonlineshopping.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateNewAccountPage extends PageObject {

    By userName = By.name("usernameRegisterPage");
    By email = By.name("emailRegisterPage");
    By password = By.name("passwordRegisterPage");
    By confirmPassword = By.name("confirm_passwordRegisterPage");
    By checkIAgrre = By.name("i_agree");
    By registerButton = By.id("register_btnundefined");
    public By messageInvalidAccount = By.xpath("//*[@id='registerPage']/article/sec-form/div[2]/label[1]");
    public void setUserName(String user){
        getDriver().findElement(userName).sendKeys(user);
    }
    public void setEmail(String emailUser){
        getDriver().findElement(email).sendKeys(emailUser);
    }
    public void setPassword(String passwordUser){
        getDriver().findElement(password).sendKeys(passwordUser);
    }
    public void setConfirmPassword(String passwordUser){
        getDriver().findElement(confirmPassword).sendKeys(passwordUser);
    }
    public void clickCheckIAgree(){
        getDriver().findElement(checkIAgrre).click();
    }
    public void clickRegisterButton(){
        getDriver().findElement(registerButton).click();
    }
}

package com.advantageonlineshopping.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeLoginPage extends PageObject {
    public By userLogin = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

    public String userNamePortal(){
        return getDriver().findElement(userLogin).getText();
    }
}

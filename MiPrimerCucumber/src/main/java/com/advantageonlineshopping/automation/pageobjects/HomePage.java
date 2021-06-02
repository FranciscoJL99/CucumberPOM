package com.advantageonlineshopping.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class HomePage extends PageObject {

    By userButton = By.id("menuUser");
    public By creteNewAccountOption = By.xpath("//a[@role='link'][2]");

    public void clickUserButton() {
        getDriver().findElement(userButton).click();
    }
    public void clickCreteNewAccountOption() {
        getDriver().findElement(creteNewAccountOption).click();
    }
}

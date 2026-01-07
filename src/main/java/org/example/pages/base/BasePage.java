package org.example.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;

public class BasePage {
    protected WebDriver webDriver;

    public  BasePage(WebDriver driver){
        this.webDriver=driver;
    }
    public void open(String url){
        webDriver.get(url);
    }
    public WebElement expectedVisibleElement(WebElement element){

        return element;

    }
}

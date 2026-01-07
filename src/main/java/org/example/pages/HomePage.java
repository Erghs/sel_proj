package org.example.pages;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage {

    public  HomePage(WebDriver driver){
        super(driver);
    }

    private final By option1=By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select");
    private final By optiin2=By.xpath("/html/body/main/div/form/div/div[2]/label[2]/input");
    private final By button=By.xpath("/html/body/main/div/form/div/div[2]/button");

    public HomePage enterOption1(){
        webDriver.findElement(option1).click();
        webDriver.findElement(optiin2).click();

        return this;
    }
    public HomePage clickBtn(){
        webDriver.findElement(button).click();
        return this;
    }
}


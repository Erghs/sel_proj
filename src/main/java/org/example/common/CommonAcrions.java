package org.example.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.common.Config.PLATFORM_AND_BROWSER;

public class CommonAcrions {
    public  static WebDriver createDriver(){
        WebDriver webDriver =null;

        switch (PLATFORM_AND_BROWSER){
            case("win chrome"):
                System.setProperty("webdriver.chrome.driver", "/home/enje/IdeaProjects/sel_proj/src/main/resources/chromedriver.nuspec");
                webDriver=new ChromeDriver();
                break;
            default:
                Assert.fail("Ошибка");

        }
        webDriver.manage().window().maximize();
        return webDriver;
    }
}

package com.phuong.homework.core.webdriver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is class which help to configure chrome driver
 */
public class ChromeDriverManager {
    private static ChromeDriverManager chromeDriverManagerInstance = null;

    private ChromeDriverManager() {
    }

    public void setDriverProperty(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }

    public WebDriver createDriver(){
        setDriverProperty();
        return new ChromeDriver();
    }

    public static ChromeDriverManager getChromeManagerInstance(){
        if (chromeDriverManagerInstance ==null){
            chromeDriverManagerInstance = new ChromeDriverManager();
        }
        return chromeDriverManagerInstance;
    }
}

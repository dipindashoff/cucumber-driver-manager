package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeManager implements Browser{

    private WebDriver driver;
    private Device device;

    public ChromeManager(){
        this.device = Device.CHROME;
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public Device getDevice() {
        return device;
    }
}

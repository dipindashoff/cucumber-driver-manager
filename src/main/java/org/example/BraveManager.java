package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BraveManager implements Browser{

    private WebDriver driver;
    private Device device;

    public BraveManager(){
        this.device = Device.BRAVE;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        this.driver = new ChromeDriver(options);
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

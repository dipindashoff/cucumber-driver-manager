package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class StepDefinitions {

    private WebDriver driver;
    private DriverManager driverManager;

    public StepDefinitions(DriverManager driverManager) {
        this.driverManager = driverManager;
        this.driver = driverManager.getDriver();
    }

    @Given("go to google home page")
    public void go_to_google_home_page() {
        this.driver.get("https://google.com");
    }

}

package org.example;

import org.openqa.selenium.WebDriver;

public interface Browser {

    WebDriver getDriver();
    Device getDevice();

    default void teardown(){
        if(getDriver() != null)
            getDriver().quit();
    }

}

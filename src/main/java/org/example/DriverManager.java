package org.example;

import org.openqa.selenium.WebDriver;

enum Device {
    CHROME, BRAVE;

    public static Device getDevice() {
        Device device = Device.CHROME;
        if (System.getProperty("browser") != null) {
            try {
                device = Device.lookup(System.getProperty("browser").toUpperCase());
            } catch (InvalidBrowserException e) {
                System.err.println("Invalid browser entered. Defaulting to Chrome browser...");
//                e.printStackTrace();
            }
        }
        return device;
    }

    public static Device lookup(String browser) throws InvalidBrowserException {
        for (Device device : Device.values())
            if (device.toString().equals(browser))
                return device;

        throw new InvalidBrowserException("Invalid browser");
    }

    static class InvalidBrowserException extends Exception {
        InvalidBrowserException(String str) {
            super(str);
        }
    }
}

public class DriverManager {

    private Browser browser;
    private Device device;

    public void setupDriver(){
        this.device = Device.getDevice();
        this.browser = DriverFactory.get(device);
    }

    public WebDriver getDriver() {
        return this.browser.getDriver();
    }

    public void teardown(){
        this.browser.teardown();
    }

}

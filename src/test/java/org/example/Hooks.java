package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private DriverManager driverManager;

    public Hooks(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Before
    public void setupDriver(){
        driverManager.setupDriver();
    }

    @After
    public void teardown(){
        driverManager.teardown();
    }
}

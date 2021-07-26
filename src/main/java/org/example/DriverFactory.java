package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static Map<Device, Supplier<Browser>> map = new HashMap<>();

    static {
        map.put(Device.CHROME, () -> new ChromeManager());
        map.put(Device.BRAVE, () -> new BraveManager());
    }

    public static Browser get(Device device){
        return map.get(device).get();
    }
}

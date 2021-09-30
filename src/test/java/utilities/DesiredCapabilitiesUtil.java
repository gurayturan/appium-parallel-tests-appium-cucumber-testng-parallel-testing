package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredAndroidCapabilities(String udid, String platformVersion) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.isinolsun.app");
        desiredCapabilities.setCapability("appActivity", "com.isinolsun.app.activities.SplashActivity");
       desiredCapabilities.setCapability("skipUnlock", "true");
      desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
    public DesiredCapabilities getDesiredIOSCapabilities(String udid, String platformVersion) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("platformName", "IOS");
        desiredCapabilities.setCapability("appPackage", "com.isinolsun.app");
        desiredCapabilities.setCapability("appActivity", "com.isinolsun.app.activities.SplashActivity");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
}

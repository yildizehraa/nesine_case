package Data;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;



public class setDevice {

    public static AppiumDriver driver;
    public  WebDriverWait wait;
    public  static String userName="yildizomer";
    public  static String password="O123Y123";

    @BeforeMethod
    public void setDevice() throws MalformedURLException
    {
        try
        {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Zehra");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.1.1");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.pordiva.nesine.android");
        caps.setCapability("appActivity","com.nesine.taboutside.splash.MainActivityDefault");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 20);
        }

        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}




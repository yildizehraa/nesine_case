package Pages;

import Data.setDevice;
import com.codeborne.selenide.commands.TakeScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import Data.Allure;

public class MainPage extends setDevice
    {
       static String futbol_Xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
       static String girisYap="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]";

        @Step("Futbol seçilir.")
        public static void futbolSec() throws InterruptedException
        {
            Thread.sleep(3000);
            driver.findElementByXPath(futbol_Xpath).click();

        }
        @Step("Giriş yap butonuna tıklanır.")
        public static void girisYap() throws InterruptedException
        {
            Thread.sleep(3000);
            driver.findElementByXPath(girisYap).click();

        }

    }

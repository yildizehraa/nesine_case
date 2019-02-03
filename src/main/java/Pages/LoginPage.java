package Pages;
import Data.setDevice;
import io.qameta.allure.Step;
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
public class LoginPage extends setDevice{

        static String kullaniciAdi="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText";
        static String sifre="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText";
        static String girisYap="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button";



        @Step("Kullanıcı adı girilir.")
        public static void setKullaniciAdi() throws InterruptedException
        {
            Thread.sleep(3000);
            driver.findElementByXPath(kullaniciAdi).sendKeys(userName);

        }
        @Step("Şifre girilir.")
        public static void setSifre() throws InterruptedException
        {
            Thread.sleep(3000);
            driver.findElementByXPath(sifre).sendKeys(password);
        }
    @Step("Giriş yap butonuna tıklanır.")
    public static void girisYap() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElementByXPath(girisYap).click();
    }
    }


package Pages;

import Data.setDevice;
import com.codeborne.selenide.commands.TakeScreenshot;
import com.codeborne.selenide.commands.TakeScreenshotAsImage;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;

public class LigSecimPage extends setDevice {

    static String ligSecim="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.CheckedTextView[1]";
    static String ligTamam="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView[3]";

    @Step("Listeden lig seçimi seçilir.")
    public static void ligSecim()
    {
        driver.findElementByXPath(ligSecim).click();
    }
    @Step("Lig seçimi tamam butonuna tıklanır.")
    public static void ligTamam()
    {
        driver.findElementByXPath(ligTamam).click();
    }
}

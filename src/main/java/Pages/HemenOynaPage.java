package Pages;
import Data.setDevice;
import io.qameta.allure.Step;
import org.junit.Assert;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class HemenOynaPage extends setDevice{

    static String  hemenOyna="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    static String uyariMesaji ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView";
    @Step("Hemen oyna sayfa kontrolü")
    public static void SayfaKontrol() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Canlı Sonuçlar sayfası açılmadı", driver.findElementByXPath(hemenOyna).isDisplayed(), true);
    }
    @Step("Hemen oyna butonuna tıklanır.")
    public static void hemenOyna() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByXPath(hemenOyna).click();
    }

    @Step("Uyarı mesajı kontrolü yapılır.")
    public static void uyariKontrol() throws InterruptedException {
        Thread.sleep(3000);

        if (driver.findElementByXPath(uyariMesaji).isDisplayed())
        {
            Assert.assertEquals("Kupon bedeliniz en az 3 Tl olmalıdır.", driver.findElementByXPath(uyariMesaji).isDisplayed(), true);
        }
    }

}

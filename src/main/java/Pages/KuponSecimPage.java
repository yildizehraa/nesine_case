package Pages;
import Data.setDevice;
import io.qameta.allure.Step;

public class KuponSecimPage extends setDevice
{


    static String filtre ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageButton";
    static String mac_1 ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[4]/android.widget.TextView[1]";
    static String mac_2="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout[3]/android.widget.TextView[1]";
    static String mac_3="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout[2]/android.widget.FrameLayout[4]/android.widget.TextView[1]";
    static String macOnay="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View";


   @Step("Filtre seçilir.")
    public static void filtreSec() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByXPath(filtre).click();
    }

    @Step("Maç seçimi yapılır.")
    public static void macSec() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByXPath(mac_1).click();
        Thread.sleep(3000);
        driver.findElementByXPath(mac_2).click();
        Thread.sleep(3000);
        driver.findElementByXPath(mac_3).click();
    }

    @Step("Seçimler tamamlanır.")
    public static void macOnay() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementByXPath(macOnay).click();
    }



}

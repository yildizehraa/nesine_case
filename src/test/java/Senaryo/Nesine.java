package Senaryo;

import Data.setDevice;
import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class Nesine extends setDevice
{

    @Test
    public void kuponOyna () throws InterruptedException, MalformedURLException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        HemenOynaPage hemenOynaPage = new HemenOynaPage();
        KuponSecimPage kuponSecimPage = new KuponSecimPage();
        LigSecimPage ligSecimPage = new LigSecimPage();

        Thread.sleep(5000);
        mainPage.girisYap();
        LoginPage.setKullaniciAdi();
        LoginPage.setSifre();
        LoginPage.girisYap();
        mainPage.futbolSec();
        kuponSecimPage
                .filtreSec();
        ligSecimPage.ligSecim();
        ligSecimPage.ligTamam();
        kuponSecimPage.macSec();
        kuponSecimPage.macOnay();
        hemenOynaPage.hemenOyna();
        hemenOynaPage.uyariKontrol();



    }
}

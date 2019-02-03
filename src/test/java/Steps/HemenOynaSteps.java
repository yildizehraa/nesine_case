package Steps;
import Pages.HemenOynaPage;
import Pages.KuponSecimPage;
import Pages.LigSecimPage;
import Pages.MainPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.tr.Diyelimki;
import cucumber.api.java.tr.Eğerki;
import cucumber.api.java.tr.Ozaman;
import org.junit.Assert;
public class HemenOynaSteps
{
        @Given("^Futbol seçilir$")
        public void FutbolSec() throws Throwable
        {
            MainPage.futbolSec();
        }

    @And("^Lig filterlemesi için filtre butonuna tıklanır$")
    public void FilterSec() throws Throwable {
        KuponSecimPage.filtreSec();
    }

    @And("^Lig seçilir$")
    public void LigSec() throws Throwable {
        LigSecimPage.ligSecim();
        LigSecimPage.ligTamam();
    }
    @And("^Kupon seçilir$")
    public void MacSec() throws Throwable {
        KuponSecimPage.macSec();
        KuponSecimPage.macOnay();
    }

    @Then("^Hemen oyna butonu seçilir$")
    public void Oyna() throws Throwable {
        HemenOynaPage.hemenOyna();
    }

}



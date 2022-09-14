package stepDefinitions;

import io.cucumber.java.en.*;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

public class A101StepDefinitions {
    A101Page a101Page = new A101Page();

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
    }
    @Then("kullanici cerezi kabul eder")
    public void kullaniciCereziKabulEder() {
        a101Page.cerez.click();
    }
    @Then("kullanici A101 anasayfasinda dropdown a tiklar")
    public void kullanici_a101_anasayfasinda_giris_yap_a_tiklar() {
        a101Page.dropdowmOpen.click();
    }
    @And("kullanici A{int} anasayfasinda login e tiklar")
    public void kullaniciAAnasayfasindaLoginETiklar(int arg0) {
        a101Page.girisYapButton.click();
    }
    @When("kullanici telefon bilgilerini girer")
    public void kullaniciTelefonBilgileriniGirer() throws InterruptedException {
        a101Page.phone.sendKeys("423830774");
        Thread.sleep(3000);
    }
    @And("kullanici giris butonuna basar")
    public void kullaniciGirisButonunaBasar() throws InterruptedException {
        a101Page.submitButon.click();
        Thread.sleep(3000);
    }
    @And("kullanici dogrulama butonuna tiklar")
    public void kullaniciDogrulamaBtonunaTiklar() throws InterruptedException {
        a101Page.dogrulamaKodu.click();
        Thread.sleep(30000);
        a101Page.dogrulamaButonu.click();
        Thread.sleep(3000);
        /*
        cep telefonuna gelen dogrulama kodunu girebilmek
        icin 30 saniye bekliyoruz
        cep tlefonuna gelen dogrulama kodunu manuel olarak girmek zorundayiz
         */
    }
    @When("kullanici arama kutusuna kadin bluz yazar ve enter a tiklar")
    public void kullaniciAramaKutusunaKadinBluzYazarVeEnterATiklar() throws InterruptedException {
    a101Page.aramaKutusu.sendKeys("kadın bluz");
    Thread.sleep(2000);
    a101Page.aramaButonu.click();
    }
    @And("kullanici siyah renk secenegini tiklar")
    public void kullaniciSiyahRenkSeceneginiTiklar() throws InterruptedException {
    a101Page.renk.click();
    Thread.sleep(2000);
    }
    @And("kullanici ilk urune tiklar")
    public void kullaniciIlkUruneTiklar() throws InterruptedException {
        a101Page.ilkUrun.click();
        Thread.sleep(2000);
    }
    @And("kullanici beden olarak M Medium secer")
    public void kullaniciBedenOlarakMMediumSecer() throws InterruptedException {
        a101Page.bedenSecim.click();
        Thread.sleep(2000);
    }
    @And("kullanici urunu sepete ekler")
    public void kullaniciUrunuSepeteEkler() throws InterruptedException {
        a101Page.sepetEkleButonu.click();
        Thread.sleep(2000);
    }
    @And("kullanici sepeti goruntulu leye tiklar urunun eklendigini test eder")
    public void kullaniciSepetiGoruntuluLeyeTiklarUrununEklendiginiTestEder() throws InterruptedException {
        a101Page.sepetGoruntuleButonu.click();
        Thread.sleep(2000);

        String actualUrun=" Calvin Klein CJ9T1329-BLK Kadın Body Siyah";
        String expectedUrun=a101Page.aramaSonucYazisi.getText();
        Assert.assertTrue(expectedUrun.contains(actualUrun));
    }



    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }



}

package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

public class A101StepDefinitions {
    A101Page a101Page = new A101Page();
    Faker faker=new Faker();

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

        String actualUrun="Calvin Klein CJ9T1329-BLK Kadın Body Siyah";
        String expectedUrun=a101Page.aramaSonucYazisi.getText();
        Assert.assertTrue(expectedUrun.contains(actualUrun));
    }

    @And("kullanici urunun adetini ve bedenini kontrol eder")
    public void kullaniciUrununAdetiniVeBedeniniKontrolEder() {
        String actualAdet="";
        String expectedAdet=a101Page.aramaSonucAdet.getText();
        Assert.assertEquals(expectedAdet,actualAdet);

        String actualBeden="M";
        String expectedBeden=a101Page.aramaSonucBeden.getText();
        Assert.assertTrue(expectedBeden.contains(actualBeden));
    }
    @When("kullanici sepeti onayla butonuna tiklar")
    public void kullaniciSepetiOnaylaButonunaTiklar() throws InterruptedException {
        a101Page.sepetiOnaylaButonu.click();
        Thread.sleep(2000);
    }
    @And("kullanici odeme ekranina gidildigini kontrol eder")
    public void kullaniciOdemeEkraninaGidildiginiKontrolEder() {
        String actualUrl="https://www.a101.com.tr/orders/checkout/";
        String expectedUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    // Second Case Step Definitions

    @Then("kullanici giyim aksesuar i tiklar")
    public void kullanici_giyim_aksesuar_i_tiklar() throws InterruptedException {
       a101Page.giyimAksesuarButonu.click();
       Thread.sleep(3000);
    }
    @Then("kullanici kadin ic giyim i tiklar")
    public void kullanici_kadin_ic_giyim_i_tiklar() throws InterruptedException {
        a101Page.kadinIcGiyimButonu.click();
        Thread.sleep(3000);
    }
    @Then("kullanici dizalti corap tiklar")
    public void kullanici_dizalti_corap_tiklar() throws InterruptedException {
        a101Page.dizAltiCorapButonu.click();
        Thread.sleep(3000);
    }
    @And("kullanici ilk urunu secer")
    public void kullaniciIlkUrunuSecer() throws InterruptedException {
        a101Page.ilkUrunCorap.click();
        Thread.sleep(3000);
    }
    @Then("kullanici acilan urunun siyah oldugunu dogrular")
    public void kullanici_acilan_urunun_siyah_oldugunu_dogrular() {
        String actualRenk="SİYAH";
        String expectedRenk=a101Page.ilkUrunCorapRenk.getText();
        Assert.assertTrue(expectedRenk.contains(actualRenk));
    }


    @And("kullanici sepeti goruntulu leye tiklar")
    public void kullaniciSepetiGoruntuluLeyeTiklar() throws InterruptedException {
        a101Page.sepetGoruntuleButonu.click();
        Thread.sleep(3000);
    }

    @When("kullanici uye olmadan devam et tiklar")
    public void kullaniciUyeOlmadanDevamEtTiklar() throws InterruptedException {
        a101Page.uyeOlmadanDevamEtButon.click();
        Thread.sleep(3000);
    }

    @And("kullanici e-mail girer ve devam et butonu tiklar")
    public void kullaniciEMailGirerVeDevamEtButonuTiklar() throws InterruptedException {
        a101Page.eMail.sendKeys(faker.internet().emailAddress()+ Keys.TAB);
        Thread.sleep(3000);
        a101Page.devamEtButon.click();
        Thread.sleep(3000);
    }
}

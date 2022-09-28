package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

public class A101StepDefinitions {
    A101Page a101Page = new A101Page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
    }

    @Then("kullanici cerezi kabul eder")
    public void kullaniciCereziKabulEder() {
        Driver.waitAndClick(a101Page.cerez, 2);

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

        String actualUrun = "Calvin Klein CJ9T1329-BLK Kadın Body Siyah";
        String expectedUrun = a101Page.aramaSonucYazisi.getText();
        Assert.assertTrue(expectedUrun.contains(actualUrun));
    }

    @And("kullanici urunun adetini ve bedenini kontrol eder")
    public void kullaniciUrununAdetiniVeBedeniniKontrolEder() {
        String actualAdet = "";
        String expectedAdet = a101Page.aramaSonucAdet.getText();
        Assert.assertEquals(expectedAdet, actualAdet);

        String actualBeden = "M";
        String expectedBeden = a101Page.aramaSonucBeden.getText();
        Assert.assertTrue(expectedBeden.contains(actualBeden));
    }

    @When("kullanici sepeti onayla butonuna tiklar")
    public void kullaniciSepetiOnaylaButonunaTiklar() throws InterruptedException {
        a101Page.sepetiOnaylaButonu.click();
        Thread.sleep(2000);
    }

    @And("kullanici odeme ekranina gidildigini kontrol eder")
    public void kullaniciOdemeEkraninaGidildiginiKontrolEder() {
        String actualUrl = "https://www.a101.com.tr/orders/checkout/";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    // Second Case Step Definitions

    @Then("kullanici giyim aksesuar i tiklar")
    public void kullanici_giyim_aksesuar_i_tiklar() {
        Driver.waitAndClick(a101Page.giyimAksesuarButonu, 2);
    }

    @Then("kullanici kadin ic giyim i tiklar")
    public void kullanici_kadin_ic_giyim_i_tiklar() {
        Driver.waitAndClick(a101Page.kadinIcGiyimButonu, 2);
    }

    @Then("kullanici dizalti corap tiklar")
    public void kullanici_dizalti_corap_tiklar() {
        Driver.waitAndClick(a101Page.dizAltiCorapButonu, 2);
    }

    @And("kullanici ilk urunu secer")
    public void kullaniciIlkUrunuSecer() {
        Driver.waitAndClick(a101Page.ilkUrunCorap, 2);
    }

    @Then("kullanici acilan urunun siyah oldugunu dogrular")
    public void kullanici_acilan_urunun_siyah_oldugunu_dogrular() {
        String actualRenk = "SİYAH";
        String expectedRenk = a101Page.ilkUrunCorapRenk.getText();
        Assert.assertTrue(expectedRenk.contains(actualRenk));
    }

    @And("kullanici sepeti goruntulu leye tiklar")
    public void kullaniciSepetiGoruntuluLeyeTiklar() {
        Driver.waitAndClick(a101Page.sepetGoruntuleButonu, 2);
    }

    @When("kullanici uye olmadan devam et tiklar")
    public void kullaniciUyeOlmadanDevamEtTiklar() {
        Driver.waitAndClick(a101Page.uyeOlmadanDevamEtButon, 2);
    }

    @And("kullanici e-mail girer ve devam et butonu tiklar")
    public void kullaniciEMailGirerVeDevamEtButonuTiklar() {
        a101Page.eMail.sendKeys(faker.internet().emailAddress() + Keys.TAB);
        Driver.wait(2);

        Driver.waitAndClick(a101Page.devamEtButon, 2);
    }

    @When("kullanici yeni adres olusturur")
    public void kullaniciYeniAdresOlusturur() throws InterruptedException {
        Driver.waitAndClick(a101Page.yeniAdresOlusturButonu, 2);

        actions.click(a101Page.adresBasligi).
                sendKeys("Ev adresi").
                sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone())
                .perform();
        Driver.wait(2);

        Select il = new Select(a101Page.ilDropDown);
        il.selectByVisibleText("İSTANBUL");
        Thread.sleep(3000);
        Select ilce = new Select(a101Page.ilceDropDown);
        ilce.selectByVisibleText("ÜMRANİYE");
        Thread.sleep(3000);
        Select mahalle = new Select(a101Page.mahalleDropDown);
        mahalle.selectByValue("36277");
        Driver.wait(2);

        actions.click(a101Page.adres).
                sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).
                sendKeys("34878").
                perform();
        Driver.wait(2);
    }

    @And("kullanici adres kaydet tiklar")
    public void kullaniciAdresKaydetTiklar() throws InterruptedException {
        Driver.waitAndClick(a101Page.adresKaydetButonu, 2);
    }

    @And("kullanici kaydet ve devam et tiklar")
    public void kullaniciKaydetVeDevamEtTiklar() throws InterruptedException {
        Driver.waitAndClick(a101Page.kaydetVeDevamEtButonu, 2);
    }

    @And("kullanici odeme ekrani geldigini kontrol eder")
    public void kullaniciOdemeEkraniGeldiginiKontrolEder() {
        Assert.assertTrue(a101Page.odemeSayfasi.isDisplayed());
    }

    @And("kullanici siparisi Tamamla tiklar")
    public void kullaniciSiparisiTamamlaTiklar() throws InterruptedException {
        Driver.waitAndClick(a101Page.siparisiTamamlaButonu, 2);
    }

    @And("kullanici Lutfen kart secin veya kart bilgisi girin yazisini gorur")
    public void kullaniciLutfenKartSecinVeyaKartBilgisiGirinYazisiniGorur() {
        String  expectedText1= "Lütfen kart seçin veya kart bilgisi girin.";
        String  actualText1= a101Page.kartBilgisiGirinText.getText();
        Assert.assertEquals(expectedText1, actualText1);
    }
}

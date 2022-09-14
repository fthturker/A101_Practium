package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {
    public A101Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerez;
    @FindBy(xpath = "//a[@class='login-btn account-dropdown']")
    public WebElement dropdowmOpen;
    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement girisYapButton;
    @FindBy(id="phone")
    public WebElement phone;
    @FindBy(xpath = "//button[contains(text(),'GİRİŞ YAP')]")
    public WebElement submitButon;
    @FindBy(xpath = "//input[@name='code']")
    public WebElement dogrulamaKodu;
    @FindBy(xpath = "//button[@class='js-send-verification button green']")
    public WebElement dogrulamaButonu;
    @FindBy(xpath = "//input[@class='js-search-input js-search-autocomplete personaclick-instant-search ui-autocomplete-input personaclick-instant-search-rendered']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement aramaButonu;
    @FindBy(xpath = "//label[@for='attributes_integration_colourSİYAH']")
    public WebElement renk;
    @FindBy(xpath = "//img[@alt='Calvin Klein CJ9T1329-BLK Kadın Body Siyah']")
    public WebElement ilkUrun;
    @FindBy(xpath = "//a[normalize-space()='M']")
    public WebElement bedenSecim;

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepetEkleButonu;

    @FindBy(xpath = "//a[@class='go-to-shop']")
    public WebElement sepetGoruntuleButonu;

    @FindBy(xpath = "//a[@class='title'][contains(text(),'Calvin Klein CJ9T1329-BLK Kadın Body Siyah')]")
    public WebElement aramaSonucYazisi;

}


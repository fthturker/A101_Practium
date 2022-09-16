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
    @FindBy(xpath = "(//a[@title='Calvin Klein CJ9T1329-BLK Kadın Body Siyah'])[2]")
    public WebElement ilkUrun;
    @FindBy(xpath = "//a[normalize-space()='M']")
    public WebElement bedenSecim;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepetEkleButonu;
    @FindBy(xpath = "//a[@class='go-to-shop']")
    public WebElement sepetGoruntuleButonu;
    @FindBy(xpath = "(//a[@title='Calvin Klein CJ9T1329-BLK Kadın Body Siyah'])[3]")
    public WebElement aramaSonucYazisi;
    @FindBy(xpath = "//input[@value='1']")
    public WebElement aramaSonucAdet;
    @FindBy(xpath = "//span[normalize-space()='M']")
    public WebElement aramaSonucBeden;
    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    public WebElement sepetiOnaylaButonu;

    // Second Case
    @FindBy(xpath = "(//a[normalize-space()='Giyim & aksesuar'])[1]")
    public WebElement giyimAksesuarButonu;

    @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Kadın İç Giyim')]")
    public WebElement kadinIcGiyimButonu;

    @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Dizaltı Çorap')]")
    public WebElement dizAltiCorapButonu;

    @FindBy(xpath = "//img[@alt='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public WebElement ilkUrunCorap;

    @FindBy(xpath = "//span[contains(text(),'SİYAH')]")
    public WebElement ilkUrunCorapRenk;

    @FindBy(xpath = "//a[normalize-space()='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEtButon;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement eMail;

    @FindBy(xpath = "//button[normalize-space()='DEVAM ET']")
    public WebElement devamEtButon;
}


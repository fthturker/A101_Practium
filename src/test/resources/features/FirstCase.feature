@A101
Feature: First Case A101 test otomasyon Practicum

  Scenario: Uctan uca test otomasyonu
    Given kullanici "a101Url" anasayfasinda
    Then kullanici cerezi kabul eder
    Then kullanici A101 anasayfasinda dropdown a tiklar
    And kullanici A101 anasayfasinda login e tiklar
    When kullanici telefon bilgilerini girer
    And kullanici giris butonuna basar
    And kullanici dogrulama butonuna tiklar
    When kullanici arama kutusuna kadin bluz yazar ve enter a tiklar
    And kullanici siyah renk secenegini tiklar
    And kullanici ilk urune tiklar
    And kullanici beden olarak M Medium secer
    And kullanici urunu sepete ekler
    And kullanici sepeti goruntulu leye tiklar urunun eklendigini test eder




    And kullanici sayfayi kapatir




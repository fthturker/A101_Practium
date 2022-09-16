@A101/2
Feature: Second Case A101 test otomasyon Practicum

  Scenario: Uctan uca test otomasyonu
    Given kullanici "a101Url" anasayfasinda
    And kullanici cerezi kabul eder
    Then kullanici giyim aksesuar i tiklar
    And kullanici kadin ic giyim i tiklar
    And kullanici dizalti corap tiklar
    And kullanici ilk urunu secer
    And kullanici acilan urunun siyah oldugunu dogrular
    When kullanici urunu sepete ekler
    And kullanici sepeti goruntulu leye tiklar
    And kullanici sepeti onayla butonuna tiklar
    When kullanici uye olmadan devam et tiklar
    And kullanici e-mail girer ve devam et butonu tiklar

    And kullanici sayfayi kapatir
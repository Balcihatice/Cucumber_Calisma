# aall sitesinde 3 adet negatif test senaryosu olusturalim
  #1- Dogru username yanlis passsword
  #2- yanlis username-dogru password
  #3- yanlis username-yanlis password

Feature: US1006 yanlis bilgilerle siteye giris yapilamaz
@negative
  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "allUrl" anasayfasinda
    Then Sig In yazisina tiklar
    And  gecerli username girer
    And gecersiz password girer
    And SIGN IN butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And  sayfayi kapatir

 Scenario: TC10 yanlis kullanici adi ile giris yapar
    Given kullanici "allUrl" anasayfasinda
    Then Sig In yazisina tiklar
    And  gecersiz username girer
    And gecerli password girer
    And SIGN IN butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And  sayfayi kapatir

  Scenario: TC11 yanlis kullanici adi ve sifre ile giris yapar
    Given kullanici "allUrl" anasayfasinda
    Then Sig In yazisina tiklar
    And  gecersiz username girer
    And gecersiz password girer
    And SIGN IN butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And  sayfayi kapatir
Feature: US1005 dogru kullanici adi ve sifre ile giris yapar

  @allure @pr2
  Scenario: TC12 pozitif login test

    Given kullanici "allUrl" anasayfasinda
    Then Sig In yazisina tiklar
    And  gecerli username girer
    And gecerli password girer
    And SIGN IN butonuna basar
    Then sayfaya giris yaptigini test eder
    And  sayfayi kapatir




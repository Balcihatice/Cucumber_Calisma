@vendor
Feature: Vendor Registration

  Scenario: TC1015 vendor olarak siteye kayit yapabilmeli

    Given kullanici allure2you ana sayfasina gider
    When "Register" butonuna tiklar
    Then "Become a Vendor" yazisina tiklar
    And Email alanina "Email" adresini yazar
    And Email adresine gelen codu "Verification Code" alanina yazar
    And password alanina "Password" yazar
    And Confirm password alanina "Confirm Password" yazar
    And "Register" kayit butonuna tiklar
    Then Let`s Go yazisinin gorunur oldugunu dogrular
    And sayfayi kapatir
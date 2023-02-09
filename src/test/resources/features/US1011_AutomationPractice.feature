Feature: US1011 kullanici register yapabilmeli

  @aut
  Scenario: TC16 kullanici uygun daatalarla register olabilmeli

    Given kullanici "automationPractice" anasayfasinda
    And user SignIn-Login linkine tiklar
    And New User Signup! bolumune  name adresi girer
    And New User Signup! bolumune   ve email adresi girer
    And SignUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Creaate Account butonuna tiklar
    Then hesap olustugunu dogrular
    And sayfayi kapatir

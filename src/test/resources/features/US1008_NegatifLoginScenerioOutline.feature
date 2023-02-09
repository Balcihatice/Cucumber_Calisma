Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz
@sirali
  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz
    Given kullanici "allUrl" anasayfasinda
    Then Sig In yazisina tiklar
    And  gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And SIGN IN butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And  sayfayi kapatir

    Examples:
      | username | password  |
      | manager5 | manager5! |
      | manager6 | manager6! |
      | manager7 | manager7! |
      | manager8 | manager8! |
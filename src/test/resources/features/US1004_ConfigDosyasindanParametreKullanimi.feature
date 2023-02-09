Feature: US1004 kullanici parametre ile configuration file`i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "techproUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url`nin "techpro" icerdigini test eder
    Then sayfayi kapatir
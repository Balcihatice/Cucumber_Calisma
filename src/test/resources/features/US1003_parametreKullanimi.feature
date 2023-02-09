Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre @pr1
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon ana sayfasinda
    And kullanici "Java" icin arama yapar
    And sonucun "Hava" icerdigini test eder
    And sayfayi kapatir
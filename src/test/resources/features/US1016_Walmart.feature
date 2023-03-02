@walmart
Feature: US1015_Walmart_parameter_arama

  Scenario Outline: TC1016 aranan kelime title`da olmali

    Given kullanici walmart ana sayfaya gider
    When walmart sayfasinda "<arananlar>" icin arama yapar
    Then walmartta sayfa basliginin "<arananlar>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | arananlar |
      | Pencil    |
      | Popcorn   |
      | Shose     |
      | Bag       |
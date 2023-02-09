@tumu
Feature: US1001_Kullanici Amazon sayfasinda arama yapar.

  @nutella @ikisi
  Scenario: TC01 kullanici amazona giter
    Given kullanici amazon ana sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java @pr1
  Scenario: TC 02 kullanici amazon da Jaba aratir
    Given kullanici amazon ana sayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @iphone
  Scenario:
    When kullanici amazon ana sayfasinda
    And kullanici iPhone icin arama yapar
    Then sonuclarin IPhone icerdigini test eder

    And sayfayi kapatir






@university
Feature: US1013 webdriver_university

  Scenario: TC1001
    Given kullanici "university" anasayfasina gider
    When login portal`a kadar iner
    Then Login Portal a tiklar
    And Diger window`a gecer
    And "Rose" alanina deger yazar
    And login butonuna tiklar
    Then popup ta cikan yazinin "validation failed" oldugunu test eder
    And Ok diyerek popup`i kapatir
    And ilk sayfaya geri doner
    Then ilk sayfada oldugunu test eder

Feature: US1010 herokuapp Delete testi
@herokuApp
  Scenario: TC15 herokuapp`dan delete butonu calismasi

    Given kullanici"herokuappUrl" anasayfasina gider
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna tiklar
    And add element butonunun gorunmedigini test eder

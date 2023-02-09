Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @editor
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    Given kullanici "editorUrl" adresine gider
    Then New butonuna tiklar
    And kullanici 1 sn bekler
    And  isim bolumune  "<firstname>" yazar
    And kullanici 1 sn bekler
    And  soyisim bolumune  "<lastname>" yazar
    And kullanici 1 sn bekler
    And  position bolumune  "<position>" yazar
    And kullanici 1 sn bekler
    And  office bolumune  "<office>" yazar
    And kullanici 1 sn bekler
    And  extention bolumune  "<extention>" yazar
    And kullanici 1 sn bekler
    And  startDate bolumune  "<startDate>" yazar
    And kullanici 1 sn bekler
    And  salary bolumune  "<salary>" yazar
    And kullanici 1 sn bekler
    And create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    And  isim bolumunde "<firstname>" oldugunu test eder
    And kullanici 1 sn bekler
    And sayfayi kapatir

    Examples:
      |firstname  |lastname|position|office    |extention|startDate |salary|
      |alim      |alim    |UI      |ankara   |UI       |2022-10-09|10000 |
      |berk      |berk    |Ba      |samsun   |api      |2022-06-09|10000 |
      |hasan     |hasan   |tester  |berlin   |-        |2022-08-09|10000 |
      |fatih     |fatih   |PO      |fransa   |-        |2022-03-09|10000 |
      |veli      |veli    |tester  |almanya  |-        |2022-03-09|10000 |


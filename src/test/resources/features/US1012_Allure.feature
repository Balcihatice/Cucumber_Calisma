Feature: US003 Kullanici Adres bilgilerini kaydedebilmeli

  @allure2
  Scenario: TC001 kullanici Billing Adress(Fatura Adresi) ekleyebilmeli
    Given kullanici "<allureLogin>" sayfasina gider
    And  sing in butonuna tiklar
    And  "<email>" bilgisini girer
    And  "<password>" password bilgisini girer
    And  SignIn butonuna tiklar
    And My Account butonuna tiklar
    And ADRESSES butonuna tiklar
    Then Billing Adres basliginda ADD butonunun gorunur oldugunu dogrular
    And ADD butonuna tiklar
    And First Name alanina adini yazar
    And Last Name alanina Soyadini yazar
    And Country Region alaninindan ulkesini secer
    And Street address alanina cadde adini yazar
    And Town City alanina ulke adini yazar
    And Province alanindan yasadigi sehri secer
    And Zip code alanina posta kodunu girer
    And phone alanina telefon numarasini yazar
    Then Email adress alaninda mail adresi oldugunu dogrular
    And SAVE  butonuna tiklar
    Then "Address change succesfully" yazisinin gorunur oldugunu dogrular
    And sayfayi kapatir

  @shippingAllure
  Scenario: TC002 kullanici Shipping Adress ekleyebilmeli
    Given kullanici "<allureLogin>" sayfasina gider
    And  sing in butonuna tiklar
    And  "<email>" bilgisini girer
    And  "<password>" password bilgisini girer
    And  SignIn butonuna tiklar
    And My Account butonuna tiklar
    And ADRESSES butonuna tiklar
    Then Shipping Adres basliginda ADD butonunun gorunur oldugunu dogrular
    And Shipping ADD butonuna tiklar
    And Shipping sayfasinda First Name alanina adini yazar
    And Shipping sayfasinda Last Name alanina Soyadini yazar
    And Shipping sayfasinda Country Region alaninindan ulkesini secer
    And Shipping sayfasinda Street address alanina cadde adini yazar
    And Shipping sayfasinda Zip code alanina posta kodunu girer
    And Shipping sayfasinda Town City alanina ulke adini yazar
    And Shipping sayfasinda Province alanindan yasadigi sehri secer
    And Shipping sayfasinda SAVE  butonuna tiklar
    Then Shipping sayfasinda "Address change succesfully" yazisinin gorunur oldugunu dogrular
    And sayfayi kapatir




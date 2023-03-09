Feature: Onliner

  Scenario:
    Given Go to "https://www.onliner.by/"
    When I navigate to the "Автобарахолка" page
    And In filters choose "USD" as currency
    And  In filter 0 input from "0" to "100000"
    And Click the menu of filter with text "Любой"
    And In submenu choose item "Седан"
    And In filter "Коробка передач" choose "Автоматическая"
    And Check results
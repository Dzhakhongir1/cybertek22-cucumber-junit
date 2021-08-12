Feature:smart bear order procces
  @smart

  Scenario Outline: User should be able order from SmartBear webpage
    Given User is logged into SmartBear Tester account and on Order page
    When User fills out the form as followed:
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customers name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>"
    And User selects Visa as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    Then User verifies "<expected name>" is in the list
    Examples:
      | product     | quantity | customers name | street      | city      | state | zip   | card number  | expiration date | expected name  |
      | MyMoney     | 1        | Ken Adams      | Kinzie st   | Chicago   | IL    | 60004 | 313313133315 | 12/22           | Ken Adams      |
      | FamilyAlbum | 4        | Joey Tribbiani | State st    | Chicago   | IL    | 60656 | 123433534545 | 11/22           | Joey Tribbiani |
      | ScreenSaver | 5        | Rachil Green   | Michigan st | Chicago   | IL    | 60056 | 658545465465 | 10/22           | Rachil Green   |
      | MyMoney     | 5        | Chandler Bing  | Erie st     | Chicago   | IL    | 60666 | 645645545454 | 10/22           | Chandler Bing  |
      | FamilyAlbum | 9        | Dr DrakeRamory | Dale st     | Arl hgths | IL    | 60452 | 350435453405 | 10/22           | Dr DrakeRamory |
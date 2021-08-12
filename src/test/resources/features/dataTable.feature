Feature: Examples of Cucumber data table implementation
  Scenario: somehing is happening
    #Given user does somehting
  Then user should see below words displayed
    | Apple      |
    | Kiwi       |
    | Orange     |
    | Strawberry |
    | mango      |
    | tomato     |
    | cucumber   |
    Scenario: Library login example using data table
      Given user is on the log in page of library app
      When user enters username password as below
        | username | librarian13@library |
        | password | 9rf6axdD            |
      Then user should see title something
  @wip1
    Scenario: User should be able to see all 12 moth in month dropdown
      Given User is on the dropdowns page of practice toll
      Then hen user should see below onfo in month dropdown
        | January   |
        | February  |
        | March     |
        | April     |
        | May       |
        | June      |
        | July      |
        | August    |
        | September |
        | October   |
        | November  |
        | December  |


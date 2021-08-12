Feature: Google search functionality
  Agile story : as a user , when i am on the google search page, i should be able to search whatever
  i want and see relevant information

  Scenario: Search page title verification
    Given  user is on Google home page
    Then User should see title is Google
@wip3
  Scenario: User search title verification
    Given user is on Google home page
    When User searches for "apple"
    Then user should see "apple" in the title
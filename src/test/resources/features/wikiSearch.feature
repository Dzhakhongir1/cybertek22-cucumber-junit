Feature: Wikipedia search functionality
  as a user , i should be able to search terms and see relevent information
  Case: search for "Steve Jobs" the title , the header , and the inage header
  should be displayed as "Steve Jobs"
  Scenario: Wikipedia Search Functionality Title Verification
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button
  Then User sees "Steve Jobs" is in the wiki title


 Scenario: Wikipedia Search Functionality Header Verification
   Given User is on Wikipedia home page
   When User types "Steve Jobs" in the wiki search box
   And User clicks wiki search button
   Then User sees "Steve Jobs" is in the main header

@ww
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedTitle>" is in the wiki title



    Examples: search terms we are going to sue in this template is as below
      | searchValue         | expectedMainHeader  | expectedTitle       |  |
      | Steve Jobs          | Steve Jobs          | Steve Jobs          |  |
      | Albert Einstein    | Albert Einstein      | Albert Einstein      |  |
      | Khabib Nurmagomedov | Khabib Nurmagomedov | Khabib Nurmagomedov |  |


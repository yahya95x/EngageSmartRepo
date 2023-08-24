Feature: EngageSmart Challenge

  Scenario:
    Given user navigates to "https://the-internet.herokuapp.com/add_remove_elements/"
    And the user should see the "Add/Remove Elements"
    And the user should see the "Add Element"
    When the user clicks on "Add Element" button
    Then the use should see the "Delete" button
Feature: Verify conformation

  Scenario: Verifying submit button
  Given I open main page
  And I fill all the relevant information with random valid values
  When I click Submit button
  Then I see that the submit was successful


Feature: Verify video

  Scenario: Verifying that video opened
    Given I open main page
    And I wait for the popup and click copy link button
    When I open the copied link
    Then I verify that the GE Healthcare: A KMS Lighthouse Success Story video is opened


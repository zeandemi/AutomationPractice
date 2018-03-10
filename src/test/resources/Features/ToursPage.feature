Feature: TourPage test

  Scenario: Navigate to the tour page from homepage
    Given I on home page of the website
    When I click on the tour tab
    Then I navigate to tour page and get a confirmation
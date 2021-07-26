Feature: feature to test the tracking number page

  @Sanity @Regression
  Scenario: Validate tracking number box is working with the tracking numbers
    Given Tracking number page is open
    When User put the "teufuzgihfi123" in the box
    And Click on the Track button
    Then User should be able to track the package

  @Regression @Smoke @Sprint08
  Scenario Outline: Validate tracking number box is working with the tracking numbers
    Given Tracking number page is open
    When User put the "<Tracking Number>" in the box
    And Click on the Track button
    Then User should be able to track the package

    Examples: 
      | Tracking Number |
      | qwed2346ye8w900 |
      | rqau12637400202 |
      | rqrw12348375001 |

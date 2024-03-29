Feature: buy a home
  I want to use this template for my feature file

  Scenario: For buying a home
    Given after successful login into the 99Acres website
    When user selects the for buyer option on website it shows a dropdown
    And select the property in hyderabad option and clicks unnder construction option
    Then select the divine space 2BHK flat

  Scenario: To buy a Plot
    Given after successful login into the 99Acres website
    When user selects buyer option then click on Plot and click on East facing option
    And select one Plot
    Then view the review page

  Scenario: To buy a commercial property
    Given after successful login into the 99Acres website
    When user selects buyer option then clicks on commercial sale in Hyderabad
    And clicks on Post property
    Then it should display details screen

  Scenario Outline: Calculate EMI
    Given after successful login into the 99Acres website
    When user clicks on menu bar and clicks on Home loans option
    And selects the calculate EMI bar
    Then send values through "<SheetName>" from row <RowNumber> it should display pie chart

    Examples: 
      | SheetName | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |

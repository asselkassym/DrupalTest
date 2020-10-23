Feature: visitor_main
  As user I want to browse the visitor tab

  Background:
    Given validate user is on landing page

  @testRun
  Scenario Outline: Validate <"tabTitle"> tab
    When click on <"tabTitle"> tab
#    Then validate <"tabTitle"> tab is displayed
  Examples:
    |tabTitle|
#    |Visitor |
    |Plan Sponsor|
#    |Physician   |
#    |Consultant  |
Feature: Corporate website smoke test feature
  This feature checks that corporate website is up and running

  @smoke1
  Scenario Outline: Validate users tabs in deafer
    Given user is on corporate landing
    When click on "<tabTitle>" user tab
    Then validate "<tabTitle>" tab is displayed
  Examples:
    |tabTitle|
#    |Visitor |
    |Plan Sponsor|
#    |Physician   |
#    |Consultant  |

  @smoke1
  Scenario Outline: Validate "<siteLink>" site link in header
    Given user is on corporate landing page
    When click on "<siteLink>" siteLink
    Then validate "<siteLink>" site is displayed
  Examples:
    |siteLink|
    |Pharmacist Site|
    |Member Site|
    
 @smoke
 Scenario Outline: Validate hamburger menu items
  Given user is on corporate landing page
  When click on hamburger menu
  Then select "<category>" submenu and validate every subcategory
 Examples:
  |category|
  |Who we help|
  |Services & Solutions|
  |Insights & Ideas|
  |About Us|

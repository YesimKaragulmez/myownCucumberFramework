@GLB_SignDatatable
Feature: Scenario Outline example

  Scenario Outline: testing the data tables web page
    Given user is on the glbtrader page
    And user click on the join now
    And user enter the email addre "<email>"
    And user enter the name "<name>"
    And user enter the mobile "<mobile>"
    And user enter the password "<password>"
    And user confitm the password "<re_password>"
    And user click on the sign Up
    Then verify the sign Up is successful
    Examples: Test Data
      | email              | name   | mobile    | password | re_password |
      | ktrn09@hotmail.com | Katren | 123456789 | 98765    | 98765       |

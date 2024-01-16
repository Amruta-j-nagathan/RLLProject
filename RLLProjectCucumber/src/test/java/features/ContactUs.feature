@all
Feature: Test Chilternoak Furniture page I want to use this template for my feature file

  Background: 
    Given I am on Chilternoak Furniture Homepage

  Scenario Outline: Testing of ContactUs Page
    When I click on ContactUs link
    Then I will be on ContactUs Page and Capture the title of the page
    And I entered name as '<name>' on the page
    And I entered email id as '<email>' on the page
    And I entered phone no as '<phone>' on the page
    And I entered message as '<message>' on the page
    Then I click on send button

    Examples: 
      | name | email          | phone      | message                  |
      | User | user@gmail.com | 1234567891 | Hi, This is good product |
      | User | user#hncom     | 1243567891 | Hi, This is good product |
      |      |                |            |                          |
      | #### | user@gmail.com | 1243567891 | Hi, This is good product |
      | User | user@gmail.com | ########## | Hi, This is good product |
      

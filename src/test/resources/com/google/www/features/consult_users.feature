#Author: jorge_101995@hotmail.com
Feature: Consult Users
  As a client of the application
  I want to consult the users that are
  in my app

  Scenario Outline: Consult a specific user
    Given Juan wants to make a consult of users
    When Juan tries to consult the user with name <first name>
    Then Juan should see that the consulted user appears

    Examples: 
      | first name |
      | Vilma      |
      | Angel      |
      | Halie      |

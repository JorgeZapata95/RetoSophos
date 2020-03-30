#Author: jorge_101995@hotmail.com
Feature: Buying products in metro.pe
  As a client of metro
  I want to be able to make purchases in the web portal
  in order to acquire products of my need

  Scenario: Adding a product to the shopping cart
    Given Juan wants to add a new product to his shopping cart
    When Juan tries to add the product lavadora to his shopping cart
    Then Juan should see that his purchase is now including the added product 

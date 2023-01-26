Feature: ECommerce Signup

  @Smoke
  Scenario Outline: ECommerce All Field Data Entry
    Given provide the url of ecommerce "https://admin-demo.nopcommerce.com/login"
    When input the email address "<email>" and password "<password>"
    When click on Log in button
    Then verfiy the title as "Dashboard / nopCommerce administration"
    When click on logout button

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |

  @Sanity
  Scenario Outline: Add a new category under Catalog
    Given provide the url of ecommerce "https://admin-demo.nopcommerce.com/login"
    When input the email address "<email>" and password "<password>"
    When click on Log in button
    When click on catalog and categories option
    And click on Add new button
    When provide the product name "<p_name>"
    And select the category as Computers
    When upload the picture of product "C:\Users\Dell\OneDrive\Desktop\mouse.jpeg"
    When click on save button
    When click on logout button

    Examples: 
      | email               | password | p_name |
      | admin@yourstore.com | admin    | Mouse  |

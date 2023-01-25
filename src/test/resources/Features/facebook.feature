Feature: Facebook Page

  Scenario Outline: Facebook Login Page
    Given provide the url "https://www.facebook.com/login/"
    When enter the emailorphonenumber "<emailornumber>"
    When enter the password "<password>"
    Then close the browser

    Examples: 
      | emailornumber | password   |
      |    9309732510 | Shree@2022 |

@Login
Feature: Verifying Adactin Hotel Login Details

  Background: 
    Given User Should on Adactin page

  Scenario Outline: Verifying Adactin Login with vaild credentials
    When User should  perform login enter "<userName>" ,"<password>"
    Then User should verify After login "Hello bharathkumar95!" successfully

    Examples: 
      | userName   | password   |
      | <userName> | <password> |

  Scenario Outline: Verifying Adactin Login  with vaild credentials using Enter key
    When User should  perform login enter "<userName>" ,"<password>" with Enter key
    Then User should verify After login "Hello bharathkumar95!" successfully

    Examples: 
      | userName   | password   |
      | <userName> | <password> |

  Scenario Outline: Verifying Adactin Login  with Invaild credentials
    When User should  perform login enter "<userName>" ,"<password>"
    Then User should verify After login Unsuccessful error message occurs"Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | userName      | password   |
      | <inValidName> | <password> |

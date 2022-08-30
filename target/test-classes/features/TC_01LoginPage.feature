Feature: Verifying  Login Details

  Scenario Outline: Verifying Login with manager credentials
    Given User Should on Login page
    When User should  perform login enter "<ManageruserName>" ,"<Managerpassword>"
    Then User should verify After login  successfully

    Examples: 
      | ManageruserName | Managerpassword |
      | username        | pass            |

  Scenario Outline: Verifying Login with staff credentials
    Given User Should on Login page
    When User should  perform login enter "<StaffuserName>" ,"<Staffpassword>" 
    Then User should verify After login  successfully

    Examples: 
      | StaffuserName | Staffpassword |
      | username      | pass          |

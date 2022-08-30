@SearchHotel
Feature: Verifying Adactin Search Hotel Details

  Background: 
    Given User Should on Adactin page
    When User should  perform login enter "<userName>" ,"<password>"
    Then User should verify After login "Hello bharathkumar95!" successfully

  Scenario Outline: Verify Search Hotels by selecting all fields
    When User should perfom in Search Hotel enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
    Then User should verify after Search Hotel "Select Hotel" is successfull

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 10/07/2022  | 11/07/2022   | 4 - Four     | 1 - One       |

  Scenario Outline: Verify Search Hotels in Mandatory field
    When User should perfom only Mandatory Field in  Search Hotel enter "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>"and"<adultPerRoom>"
    Then User should verify after Search Hotel "Select Hotel" is successfull

    Examples: 
      | location | numberOfRooms | checkInDate | checkOutDate | adultPerRoom |
      | Sydney   | 4 - Four      | 10/07/2022  | 11/07/2022   | 4 - Four     |

  Scenario Outline: Verify date checkin and checkout by passing incorrect credentials in Search Hotels
    When User should perfom in Search Hotel enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
    Then User should verify after Search Hotel Error message in CheckInDate and checkOutDate "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 10/07/2025  | 11/07/2020   | 4 - Four     | 1 - One       |

  Scenario: Verify Without enter any fields in Search Hotels click
    When User should perfom without Enter any Fields in Search Hotels
    Then User should verify after Search Hotel Error message in locations "Please Select a Location"

@SelectHotel
Feature: Verifying Adactin Select Hotel Details

  Background: 
    Given User Should on Adactin page
    When User should  perform login enter "<userName>" ,"<password>"
    Then User should verify After login "Hello bharathkumar95!" successfully

  Scenario Outline: Verify Select Hotels by select the Hotel Field
    When User should perfom in Search Hotel enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
    Then User should verify after Search Hotel "Select Hotel" is successfull
    When User should perform in Select hotel by click continue
    Then User should verify after Select Hotel "Book A Hotel" is successfull

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 10/07/2022  | 11/07/2022   | 4 - Four     | 1 - One       |

  Scenario Outline: Verify Select Hotels  by Without select any Hotel Field
    When User should perfom in Search Hotel enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
    Then User should verify after Search Hotel "Select Hotel" is successfull
    When User should perform in Select hotel by not clicking any hotel field
    Then User should verify after Select Hotel Error message occurs "Please Select a Hotel"

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 10/07/2022  | 11/07/2022   | 4 - Four     | 1 - One       |

@BookHotel
Feature: Verifying Adactin Book Hotel Details

  Background: 
    Given User Should on Adactin page
    When User should  perform login enter "<userName>" ,"<password>"
    Then User should verify After login "Hello bharathkumar95!" successfully

  Scenario Outline: Verify Book hotel by selecting all fields
    When User should perfom in Search Hotel enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
    Then User should verify after Search Hotel "Select Hotel" is successfull
    When User should perform in Select hotel by click continue
    Then User should verify after Select Hotel "Book A Hotel" is successfull
    When User should perform in Book Hotel enter "<firstName>","<lastName>" and "<billingAddress>"
      | creditCardNo  | creditCardType  | expiryMonth            | expiryYear            | cvvNumber             |
      | creditCardNo1 | creditCardType1 | creditCardExpiryMonth1 | creditCardExpiryYear1 | creditCardNcvvNumber1 |
      | creditCardNo2 | creditCardType2 | creditCardExpiryMonth2 | creditCardExpiryYear2 | creditCardNcvvNumber2 |
      | creditCardNo3 | creditCardType3 | creditCardExpiryMonth3 | creditCardExpiryYear3 | creditCardNcvvNumber3 |
      | creditCardNo4 | creditCardType4 | creditCardExpiryMonth4 | creditCardExpiryYear4 | creditCardNcvvNumber4 |
    Then User should verify After Book hotel "Booking Confirmation" successfully

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom | firstName | lastName | billingAddress                                  |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 04/07/2022  | 05/07/2022   | 4 - Four     | 1 - One       | bharath   | kumar    | No-1,abc nagar, bharth area, Brisbane  - 600001 |

  Scenario Outline: Verify Book hotel by Without selecting any fields
    When User should perfom in Search Hotel enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
    Then User should verify after Search Hotel "Select Hotel" is successfull
    When User should perform in Select hotel by click continue
    Then User should verify after Select Hotel "Book A Hotel" is successfull
    When User should perform in Book hotel without selecting any fields
    Then User should verify After Book hotel these error message occurs  "Please Enter your First Name" , "Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"and"Please Enter your Credit Card CVV Number"

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 04/07/2022  | 05/07/2022   | 4 - Four     | 1 - One       |

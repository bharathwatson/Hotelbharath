@CancelBook
Feature: Verifying Adactin Hotel to Cancel Booking

  Background: 
    Given User Should on Adactin page
    When User should  perform login enter "<userName>" ,"<password>"
    Then User should verify After login "Hello bharathkumar95!" successfully

  Scenario Outline: Verify Cancel booking in Adactin Hotel for Current Booking orderId
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
    When User should perform  to cancel the order id
    Then User should verify After Cancel Order message contains "The booking has been cancelled." sucessfully

    Examples: 
      | location | hotels       | roomType | numberOfRooms | checkInDate | checkOutDate | adultPerRoom | childPerRooom | firstName | lastName | billingAddress                                  |
      | Sydney   | Hotel Hervey | Double   | 4 - Four      | 04/07/2022  | 05/07/2022   | 4 - Four     | 1 - One       | bharath   | kumar    | No-1,abc nagar, bharth area, Brisbane  - 600001 |
	
  Scenario Outline: Verify Cancel booking in Adactin Hotel for exisiting Booked order id
    When User should perform in Booked Itinerary to cancel existing  "<orderId>"
    Then User should verify After Cancel Order message contains "The booking has been cancelled." sucessfully

    Examples: 
      | orderId    |
      | UFROE6YEGQ |

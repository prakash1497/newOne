@BookHotel
Feature: Verifying Book Hotel Details

  Scenario Outline: Verifying Book Hotel entering all fields
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login succes message "Hello janakiraman!"
    And user should enter all the fields "<Location>", "<Hotel>", "<Roomtype>", "<noofroom>", "<Checkin>", "<Checkout>","<Adults>" and "<Child>"  click on Search
    Then user should verify after search navigates to "Select Hotel"
    And user should select hotel and click on continue button
    Then user should verify after click on continue navigates to "Book A Hotel"
    And user should enter all the fields "<firstname>", "<lastname>" and "<address>" click on BookNow Btn
      | ccnum            | cctype           | expmonth | expyear | cvv |
      | 1234567890123456 | American Express | December |    2022 | 123 |
      | 9087654321654321 | Master Card      | January  |    2022 | 321 |
      | 2345673456345455 | VISA             | April    |    2022 | 147 |
      | 3456987654234587 | Other            | June     |    2022 | 141 |
    Then user should verify after click on BookNow Btn success message "Booking Confirmation" and save the order id

    Examples: 
      | username   | password | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   | firstname | lastname | address |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two | 2 - Two | Prakash   | Frank    | chennai |

  Scenario Outline: Verifying Book Hotel without enter any fields
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login succes message "Hello janakiraman!"
    And user should enter all the fields "<Location>", "<Hotel>", "<Roomtype>", "<noofroom>", "<Checkin>", "<Checkout>","<Adults>" and "<Child>"  click on Search
    Then user should verify after search navigates to "Select Hotel"
    And user should select hotel and click on continue button
    Then user should verify after click on continue navigates to "Book A Hotel"
    And user should click on BookNow Btn
    Then user should verify after click on BookNow Btn error messages "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number".

    Examples: 
      | username   | password | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two | 2 - Two |

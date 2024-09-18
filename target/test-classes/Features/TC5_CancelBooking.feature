@Cancel
Feature: Verifying Cancel Booking Details

  Scenario Outline: Verifying Cancel Booking after Booking Hotel
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
    And user should click on  Booked Itinerary and paste the order id and cancel the order
    Then user should verify after cancel the order id  success message "The booking has been cancelled."

    Examples: 
      | username   | password | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   | firstname | lastname | address |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two | 2 - Two | Prakash   | Frank    | chennai |

  Scenario Outline: Verifying Cancel Booking Existing Order
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login succes message "Hello janakiraman!"
    And user should click on  Booked Itinerary and paste the existing "<orderid>" and cancel the order
    Then user should verify after cancel the order id  success message "The booking has been cancelled."

    Examples: 
      | username   | password | orderid    |
      | prakash147 | 12345678 | 09GJR2QYKK |

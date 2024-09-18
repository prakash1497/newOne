@SelectHotel
Feature: Verifying Adactin Select Hotel Details

  Scenario Outline: Verifying by selecting Hotel Name
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login succes message "Hello janakiraman!"
    And user should enter all the fields "<Location>", "<Hotel>", "<Roomtype>", "<noofroom>", "<Checkin>", "<Checkout>","<Adults>" and "<Child>"  click on Search
    Then user should verify after search navigates to "Select Hotel"
    And user should select hotel and click on continue button
    Then user should verify after click on continue navigates to "Book A Hotel"

    Examples: 
      | username   | password | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two | 2 - Two |

  Scenario Outline: Verifying by without selecting Hotel Name
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
    Then user should verify after login succes message "Hello janakiraman!"
    And user should enter all the fields "<Location>", "<Hotel>", "<Roomtype>", "<noofroom>", "<Checkin>", "<Checkout>","<Adults>" and "<Child>"  click on Search
    Then user should verify after search navigates to "Select Hotel"
    And user should click on continue without selecting any hotel
    Then user should verify after click on continue Error message "Please Select a Hotel"

    Examples: 
      | username   | password | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two | 2 - Two |

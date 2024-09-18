@SearchHotel
Feature: Verifying Adactin Search Hotel Details

  Scenario Outline: Verifying Adactin search Hotel entering all fields
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
        Then user should verify after login succes message "Hello janakiraman!"
    And user should enter all the fields "<Location>", "<Hotel>", "<Roomtype>", "<noofroom>", "<Checkin>", "<Checkout>","<Adults>" and "<Child>"  click on Search
    Then user should verify after search navigates to "Select Hotel"

    Examples: 
      | username    | password   | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two | 2 - Two |

  Scenario Outline: Verifying Adactin Search Hotel entering mandatory fields only
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
        Then user should verify after login succes message "Hello janakiraman!"
    And user should enter only mandatory fields "<Location>", "<noofroom>", "<Checkin>", "<Checkout>" and "<Adults>" click on Search
    Then user should verify after search navigates to "Select Hotel"

    Examples: 
      | username    | password   | Location | noofroom | Checkin    | Checkout   | Adults  |
      | prakash147 | 12345678 | Sydney   | 2 - Two  | 25/11/2022 | 26/11/2022 | 2 - Two |

  Scenario Outline: Verifying Adactin serach Hotel date checking(checkin&checkout)
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
        Then user should verify after login succes message "Hello janakiraman!"
    And user should enter Checkin Date  after than Checkout Date  "<Location>", "<Hotel>", "<Roomtype>", "<noofroom>", "<Checkin>", "<Checkout>","<Adults>" and "<Child>"  click on Search
    Then user should verify after click on search button error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username    | password   | Location | Hotel          | Roomtype | noofroom | Checkin    | Checkout   | Adults  | Child   |
      | prakash147 | 12345678 | Sydney   | Hotel Sunshine | Deluxe   | 2 - Two  | 26/11/2022 | 25/11/2022 | 2 - Two | 2 - Two |

  Scenario Outline: Verifying Adactin search hotel without entering any fields
    Given user is on Adactin Login page
    When user should Login "<username>", "<password>" click login
        Then user should verify after login succes message "Hello janakiraman!"
    And user should click on search without entering any fields
    Then user should verify location error message "Please Select a Location"

    Examples: 
      | username    | password   |
      | prakash147 | 12345678 |

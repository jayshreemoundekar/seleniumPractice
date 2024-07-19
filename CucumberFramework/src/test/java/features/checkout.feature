Feature: Search and place the order for products
@PlaceOrder
Scenario Outline: Search Experience for product search in both home and offers page
Given User is on Greencart Landing Page
When User searched with shortname <Name> and extract actual name for product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And User has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |





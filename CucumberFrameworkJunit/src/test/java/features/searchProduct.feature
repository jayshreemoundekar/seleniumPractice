Feature: Search and place the order for products
@SearchProduct
Scenario Outline: Search Experience for product search in both home and offers page
Given User is on Greencart Landing Page
When User searched with shortname <Name> and extract actual name for product
Then user searched for same <Name> shortname in offerspage 
And validate product name in offer page matches with landing page

Examples:
| Name |
| Tom  |
| Beet |
| Cucu |




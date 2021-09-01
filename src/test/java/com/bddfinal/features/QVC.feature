
@tag
Feature: Title of your feature
  I want to use this template for my feature file

   @qvc
  Scenario Outline: login test 
    Given I am on "QVC homepage"
      |browser|firefox|
      |url|https://www.qvc.com/content/featured/qvc-gift-cards.html?qq=mh|
      
      And I click on "gift card"
      |xpath|//a[contains(text(),'Shop Gift Cards')]|
      And I enter "myusername" 
      |id| CUNYfirstUsernameH|mahfuz23@gmail.com|
      And I verify "the title"
      |expectedTitle|OSA Consulting Tech - All the projects.|
    When I send "<username> "and "<password>"
    Then I am on Student page
    Examples:
    |username|password|
    |mmmmmmmmmmmm|xyzzzzzzzzzzzz|
    #|kkkkkkkkkkk|pppppppppppppppp|
    
    


      
      #Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

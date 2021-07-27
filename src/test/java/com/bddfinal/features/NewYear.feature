
Feature: osa login as a student
  
   @examp
  Scenario Outline: login test 
    Given I am on "cuny homepage"
      |browser|firefox|
      |url|https://www.cuny.edu/|
    When I send "<username> "and "<password>"
    Then I am on Student page
    Examples:
    |username|password|
    |mmmmmmmmmmmm|xyzzzzzzzzzzzz|
    |kkkkkkkkkkk|pppppppppppppppp|
    
    
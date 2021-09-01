Feature: OSA login Test.
#
  # Background:
  #@InvalidUser
  #Scenario: As a guest of osa trying to login
    #Given I enter the osa url "https://osaconsultingtech.com/"
    #And I click on forum button
    #And I enter Invalid email
    #And I enter Invalid Password
    #When I click on login button
    #Then I see invalid username and password
#
  #@validUsername
  #Scenario: As a student of osa trying to login
    #And I enter valid email
    #And I enter valid Password
    #When I click on login button
    #Then I verify the student page
#
  #@validUsernameTwoline
  #Scenario: As a student of osa trying to login
    #And I enter "password" 
      #|id|password|mypassword|
     #And I enter "password" 
      #|id|password|mypassword|
      #
    #And I click on "forum button"
      #|xpath|//a[text()='Forum']|
    #Then I verify the student page
#
  #@validUsernameParameter
  #Scenario Outline: As a student of osa trying to login
    #And I enter <username> 
      #|id|password|mypassword|
    #And I enter <password> 
      #|id|password|mypassword|
   #And I click on "forum button"
      #|xpath|//a[text()='Forum']|
    #Then I verify the student page
#
    #Examples: 
      #| username | password    |
      #| fhfhfh   | hgfhggd+gjg |
      #| hgjg     | ghhfhf      |
#
  #@validUsernameOneLineParm
  #Scenario: As a student of osa trying to login
    #And I enter the email and password
      #| abcd@gmail.com | 1234567 |
    #And I click on "forum button"
      #|xpath|//a[text()='Forum']|
    #Then I verify the student page
    #
  #
#
@cuny
Scenario: Title of your scenario
     #Given I am on cuny homepage
     Given I am on "cuny homepage"
      |browser|firefox|
      |url|https://www.cuny.edu/|
     And I click on "cuny about"
      |xpath|//a[text()='About']|
     And I click on "Login"
      |xpath|//a[text()='Login']|
      And I enter "myusername" 
      |id| CUNYfirstUsernameH|mahfuz23@gmail.com|
  @osa
  Scenario: Title of your scenario
     Given I am on "osa homepage"
      |browser|firefox                      |
      |url|https://www.osaconsultingtech.com|
      
    And I click on "forum button"
      |xpath|//a[text()='Forum']|
    And I enter "myusername" 
      |id|username|mahfuz23@gmail.com|
    And I enter "mypassword" 
      |id|password|12345668|
    And I click on " login_button"
      |id|login_button|
      And I verify "the title"
      |expectedTitle|OSA Consulting Tech - All the projects.|
      #And I click on "btn_logout"
      #|id|btn_logout|
      
      
#@facebook
  #Scenario: facebook
   #Given I am on "osa homepage "
      #|browser|firefox|
      #|url|https://www.facebook.com|
    #And I enter "email" 
      #|id|email|myusername|
    #And I enter "password" 
      #|id|pass|mypassword|
    #And I click on "forum button"
      #|xpath|//button[@id="u_0_b"]|
      #And I click on "Forgot Password?"
      #|linktext|Forgot Password?|
     #And I enter "enter mobile number " 
      #|id|identify_email|+1347357125| 
      #
      #And I click on "search"
      #|id|did_submit|
      #And I click on "contine"
      #|xpath|//button[text()='Continue']|
      #And I enter "recovery_code_entry" 
      #|id|recovery_code_entry|mldlfldljljdlgjl5655|
       #And I click on "contine"
      #|xpath|//button[text()='Continue']|
      #And I click on "contine"
      #|xpath|//*[@id="u_0_9"]/div/div[3]/div/div[2]/a|
      #And I click on "No longer have access to these?"
      #|xpath|//a[text()='No longer have access to these?']|
      
      
      
      
      
      
      
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
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

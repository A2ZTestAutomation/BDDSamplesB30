Feature: Login Function

#Scenario: Valid Login
#Given User is on Login page
#When User enters login cred
#Then Should navigate to Home Page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should navigate to Home Page

#Scenario Outline: Valid Login
	
	#Given User is on Login page
	#When User enters "<username>" and "<password>"
	#Then Should navigate to Home Page

#Examples:
	#| username | password |
	# | tomsmith | SuperSecretPassword! |
	 # | tomsmith1 | SuperSecretPassword!12 |
	  #| tomsmith2 | SuperSecretPassword!12 |
	   
	   

##Scenario: Place order
#Given User is must have logged in
	
#When User search Item
#item1
#item2
 #item3	
#Then Item must be listed

Scenario: Valid Login
Given User is on Login page
When User enters login cred
	| username | password |
	| tomsmith | SuperSecretPassword! |
	| tomsmith1 | SuperSecretPassword! |
Then Should navigate to Home Page

 
	
@PhaseTwo
Feature: Contacts Management
CRUD Operations for Contact

Background: Valid Login
Given User is logged in

@SmokeTest
Scenario: Create a Contact
When User create a Contact


@RegressionTest
Scenario: Update a Contact
When User update a Contact


#Scenario: Delete a Contact
#When User delete a Contact
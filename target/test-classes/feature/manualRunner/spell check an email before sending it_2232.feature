#Auto generated NGA revision tag
@TID2232REV0.2.0
Feature: spell check an email before sending it

	Scenario: before sending an email - spell check should be triggered automatically
		Given user is in send email dialog
		When user click the send button
		Then spell check should be triggered and prompt user if errors were found

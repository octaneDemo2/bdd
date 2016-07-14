#Auto generated NGA revision tag
@TID1573REV0.2.0
Feature: Send message to multiple recipients
	Scenario: User is sending a short mail to 3 recipients
		Given User is logged in
		When User opens the send mail dialog
        And write a short message
        And add 3 recipients
        And send the mail
		Then A success message appears

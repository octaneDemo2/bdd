#Auto generated Octane revision tag
@TID1322REV0.2.0
Feature: This is the spec


	Scenario: login into the system
		Given the system is up
		When I click username and password
		Then I login into the system

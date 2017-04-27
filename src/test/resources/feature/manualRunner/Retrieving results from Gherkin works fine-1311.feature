#Auto generated Octane revision tag
@TID1311REV0.2.0
Feature: Retrieving results from Gherkin works fine


	Scenario: run it and get results and an exception
		Given i run this
		When i define one step to throw exception
		Then an exception will not be thrown

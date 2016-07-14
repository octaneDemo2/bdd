#Auto generated NGA revision tag
@TID1121REV0.3.0

Feature:background

	Background: Two users login from different tenants
		Given User A is logged in to the server, including connection to Jenkins
        And User B is logged in to the server, but from a different tenant, including connection to Jenkins, but a different one from above
        And Each of the users have different tests, different scripts, and different Jobs in the editor
        And Each one of the users have at least one test, Implemented in the editor, external results successfully arrive for each of the users alone
        
	Scenario: Injected results arrive
		Given User A runs his tests from an external source
		When User A gets the external results
		Then User B doesn't see the results in the pipeline
        And User B doesn't see any changes in his own tests
        And User B isn't affected by any way from User A runs
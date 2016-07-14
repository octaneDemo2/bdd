#Auto generated NGA revision tag
@TID1119REV0.3.0

Feature:scenario outline
	
	Scenario Outline: Both users results arrive
		Given Both users run their tests from an external source
		When Both users get the external results
		Then User <first> doesn't see the results of user <second> in his pipeline
        And User <first> doesn't see any changes in his own tests
        And User <first> isn't affected by any way from User <second> runs 
        
    Examples:
        |first	|second |
        |	A	|	B	|
        |	B	|	A	|
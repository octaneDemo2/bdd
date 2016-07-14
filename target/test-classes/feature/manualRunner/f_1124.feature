#Auto generated NGA revision tag
@TID1124REV0.5.0

Feature:table as a parameter
   
    Scenario: Injected results arrive
		Given User A runs his tests from an external source, ok:
        |Username	|Password 	|
        |	A		|	B		|
        |	B		|	A		|
		When User A gets the external results
		Then User B doesn't see the results in the pipeline
        But nothing
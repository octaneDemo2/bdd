#Auto generated Octane revision tag
@TID1197REV0.2.0
Feature: Buying items in shopping cart, single user
 
	Scenario: Julio buys items in his cart
		Given a customer named "Julio Brown" 
		Given I am logged in as Julio 
		Given I have at least one item in cart
		When I try to buy items in my cart
		Then I should be asked for my payment method 
 
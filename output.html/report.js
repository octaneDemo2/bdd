$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Gherkin from manual to automation_1185.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated Octane revision tag"
    }
  ],
  "line": 3,
  "name": "an example",
  "description": "",
  "id": "an-example",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID1111REV0.2.0"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "as an example",
  "description": "",
  "id": "an-example;as-an-example",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "something",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "do it",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "check it again",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.something()"
});
formatter.result({
  "duration": 486410912,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.doIt()"
});
formatter.result({
  "duration": 50216,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.checkIt()"
});
formatter.result({
  "duration": 28844,
  "status": "passed"
});
formatter.uri("a feature spec_1197.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated Octane revision tag"
    }
  ],
  "line": 3,
  "name": "Buying items in shopping cart, single user",
  "description": "",
  "id": "buying-items-in-shopping-cart,-single-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID1197REV0.2.0"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Julio buys items in his cart",
  "description": "",
  "id": "buying-items-in-shopping-cart,-single-user;julio-buys-items-in-his-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a customer named \"Julio Brown\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am logged in as Julio",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I have at least one item in cart",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I try to buy items in my cart",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be asked for my payment method",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Julio Brown",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.aCustomerNamed(String)"
});
formatter.result({
  "duration": 4364800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmLoggedInAsJulio()"
});
formatter.result({
  "duration": 26816,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iHaveAtLeastOneItemInCart()"
});
formatter.result({
  "duration": 32688,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iTryToBuyItemsInMyCart()"
});
formatter.result({
  "duration": 24092,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAskedForMyPaymentMethod()"
});
formatter.result({
  "duration": 29540,
  "status": "passed"
});
formatter.uri("spell check an email before sending it.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated Octane revision tag"
    }
  ],
  "line": 4,
  "name": "spell check an email before sending it too2",
  "description": "",
  "id": "spell-check-an-email-before-sending-it-too2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID1126REV0.1.0"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "before sending an email - spell check should be triggered automatically",
  "description": "",
  "id": "spell-check-an-email-before-sending-it-too2;before-sending-an-email---spell-check-should-be-triggered-automatically",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user click the send button",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "something new to this part was added",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is in send email dialog",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user is in somthing",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "spell check should be triggered and prompt user if errors were find",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userClickTheSendButton()"
});
formatter.result({
  "duration": 62160,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.somethingNewToThisPartWasAdded()"
});
formatter.result({
  "duration": 33944,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userIsInSendEmailDialog()"
});
formatter.result({
  "duration": 23048,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userIsInSomthing()"
});
formatter.result({
  "duration": 27796,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.spellCheckShouldBeTriggeredAndPromptUserIfErrorsWereFound()"
});
formatter.result({
  "duration": 22488,
  "status": "passed"
});
});
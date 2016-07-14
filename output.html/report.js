$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("spell check an email before sending it_2232.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated NGA revision tag"
    }
  ],
  "line": 3,
  "name": "spell check an email before sending it",
  "description": "",
  "id": "spell-check-an-email-before-sending-it",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID2232REV0.2.0"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "before sending an email - spell check should be triggered automatically",
  "description": "",
  "id": "spell-check-an-email-before-sending-it;before-sending-an-email---spell-check-should-be-triggered-automatically",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is in send email dialog",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click the send button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "spell check should be triggered and prompt user if errors were found",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsInSendEmailDialog()"
});
formatter.result({
  "duration": 303925639,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickTheSendButton()"
});
formatter.result({
  "duration": 48260,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.spellCheckShouldBeTriggeredAndPromptUserIfErrorsWereFound()"
});
formatter.result({
  "duration": 46165,
  "status": "passed"
});
});
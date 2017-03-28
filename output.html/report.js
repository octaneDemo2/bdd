$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("spell check an email before sending it.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated Octane revision tag"
    }
  ],
  "line": 4,
  "name": "spell check an email before sending it",
  "description": "",
  "id": "spell-check-an-email-before-sending-it",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID1278REV0.1.0"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "before sending an email - spell check should be triggered automatically",
  "description": "",
  "id": "spell-check-an-email-before-sending-it;before-sending-an-email---spell-check-should-be-triggered-automatically",
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
  "name": "something new this part added",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is in send email dialog",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "spell check should be triggered and prompt user if errors were found",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userClickTheSendButton()"
});
formatter.result({
  "duration": 143730140,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.somethingNewThisPartAdded()"
});
formatter.result({
  "duration": 23886,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userIsInSendEmailDialog()"
});
formatter.result({
  "duration": 20602,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.spellCheckShouldBeTriggeredAndPromptUserIfErrorsWereFound()"
});
formatter.result({
  "duration": 23748,
  "status": "passed"
});
});
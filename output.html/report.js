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
  "duration": 432401744,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickTheSendButton()"
});
formatter.result({
  "duration": 19625,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.spellCheckShouldBeTriggeredAndPromptUserIfErrorsWereFound()"
});
formatter.result({
  "duration": 29403,
  "status": "passed"
});
formatter.uri("test1_2171.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated NGA revision tag"
    }
  ],
  "line": 3,
  "name": "test 1",
  "description": "",
  "id": "test-1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID2171REV0.2.0"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "scenario 1",
  "description": "",
  "id": "test-1;scenario-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user send an email",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he clicks send",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "notification appears",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userSendAnEmail()"
});
formatter.result({
  "duration": 34851,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.heClicksSend()"
});
formatter.result({
  "duration": 21371,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.notificationAppears()"
});
formatter.result({
  "duration": 25074,
  "status": "passed"
});
formatter.uri("warn user if he forget an attachment_2234.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated NGA revision tag"
    }
  ],
  "line": 3,
  "name": "warn user if he forget an attachment",
  "description": "",
  "id": "warn-user-if-he-forget-an-attachment",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID2234REV0.3.0"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "user wrote attached but didnt attach anything",
  "description": "",
  "id": "warn-user-if-he-forget-an-attachment;user-wrote-attached-but-didnt-attach-anything",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is in mail dialog",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks send",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "if word \"attach\" is in mail, and nothing attached, warn user",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsInMailDialog()"
});
formatter.result({
  "duration": 37923,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksSend()"
});
formatter.result({
  "duration": 20254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "attach",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.ifWordIsInMailAndNothingAttachedWarnUser(String)"
});
formatter.result({
  "duration": 3322839,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Wilson posts to his own blog",
  "description": "",
  "id": "warn-user-if-he-forget-an-attachment;wilson-posts-to-his-own-blog",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am logged in as Wilson",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I try to post to \"Expensive Therapy\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see \"Your article was published.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmLoggedInAsWilson()"
});
formatter.result({
  "duration": 1936070,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat feature.manualRunner.MyStepdefs.iAmLoggedInAsWilson(MyStepdefs.java:161)\r\n\tat ✽.Given I am logged in as Wilson(warn user if he forget an attachment_2234.feature:11)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Expensive Therapy",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iTryToPostTo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your article was published.",
      "offset": 14
    }
  ],
  "location": "MyStepdefs.iShouldSee(String)"
});
formatter.result({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Retrieving results from Gherkin works fine-1311.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated Octane revision tag"
    }
  ],
  "line": 3,
  "name": "Retrieving results from Gherkin works fine",
  "description": "",
  "id": "retrieving-results-from-gherkin-works-fine",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID1311REV0.2.0"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "run it and get results and an exception",
  "description": "",
  "id": "retrieving-results-from-gherkin-works-fine;run-it-and-get-results-and-an-exception",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "i run this",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i define one step to throw exception",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "an exception will not be thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iRunThis()"
});
formatter.result({
  "duration": 213748116,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iDefineOneStepToThrowException()"
});
formatter.result({
  "duration": 31776,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.anExceptionWillNotBeThrown()"
});
formatter.result({
  "duration": 28776,
  "status": "passed"
});
});
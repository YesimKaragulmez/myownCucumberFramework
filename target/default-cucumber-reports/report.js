$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/explicit%20wait%20demo.feature");
formatter.feature({
  "name": "Explicit wait demo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Explicit wait example",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the demo page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitStepDefs.user_is_on_the_demo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Start button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitStepDefs.user_clicks_on_the_Start_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user waits until the page loads",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitStepDefs.user_waits_until_the_page_loads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the Hello World! text is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitStepDefs.verify_the_Hello_World_text_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
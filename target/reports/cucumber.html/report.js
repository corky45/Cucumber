$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Practical.feature");
formatter.feature({
  "name": "Background color button validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ColorFeature"
    }
  ]
});
formatter.scenario({
  "name": "Change the background color to SkyBlue",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ColorFeature"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set SkyBlue Background\"  button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.PracticalStepDefinition.button_exists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"SkyBlue\" button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PracticalStepDefinition.i_click_on_the_color_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PracticalStepDefinition.the_background_color_will_change()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
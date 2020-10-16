$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/express_scripts_corporate/visitor_main.feature");
formatter.feature({
  "name": "visitor_main",
  "description": "  As user I want to browse the visitor tab",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testRun"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "visitor_main_stepDefs.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GLB_Trader.feature");
formatter.feature({
  "name": "Scenario Outline example",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@GLB_SignDatatable"
    }
  ]
});
formatter.scenarioOutline({
  "name": "testing the data tables web page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the glbtrader page",
  "keyword": "Given "
});
formatter.step({
  "name": "user click on the join now",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the email addre \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the name \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the mobile \"\u003cmobile\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user confitm the password \"\u003cre_password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click on the sign Up",
  "keyword": "And "
});
formatter.step({
  "name": "verify the sign Up is successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "name",
        "mobile",
        "password",
        "re_password"
      ]
    },
    {
      "cells": [
        "ktrn09@hotmail.com",
        "Katren",
        "123456789",
        "98765",
        "98765"
      ]
    }
  ]
});
formatter.scenario({
  "name": "testing the data tables web page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GLB_SignDatatable"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the glbtrader page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_is_on_the_glbtrader_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the join now",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_click_on_the_join_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the email addre \"ktrn09@hotmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_enter_the_email_addre(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the name \"Katren\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_enter_the_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the mobile \"123456789\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_enter_the_mobile(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the password \"98765\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_enter_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confitm the password \"98765\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_confitm_the_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the sign Up",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.user_click_on_the_sign_Up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the sign Up is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GLB_Trader_Steps.verify_the_sign_Up_is_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTests.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Nikhil Wadalkar"
    },
    {
      "line": 2,
      "value": "#Gherkin language"
    },
    {
      "line": 3,
      "value": "#BDD - Behavioral Driven Development"
    },
    {
      "line": 4,
      "value": "#KDD - Keyword driven dev"
    },
    {
      "line": 5,
      "value": "#TDD - Test driven dev"
    },
    {
      "line": 6,
      "value": "#DDD - Data driven dev"
    },
    {
      "line": 7,
      "value": "#Hybrid"
    },
    {
      "line": 9,
      "value": "#Keywords Summary :"
    },
    {
      "line": 10,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 11,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 12,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 13,
      "value": "#When: Some key actions"
    },
    {
      "line": 14,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 15,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 16,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 17,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 18,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 19,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 20,
      "value": "#| (Data Tables)"
    },
    {
      "line": 21,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 22,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 23,
      "value": "#\"\""
    },
    {
      "line": 24,
      "value": "## (Comments)"
    },
    {
      "line": 25,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 28,
  "name": "Login functionality features",
  "description": "",
  "id": "login-functionality-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 27,
      "name": "@regression"
    },
    {
      "line": 27,
      "name": "@US1545"
    },
    {
      "line": 27,
      "name": "@login"
    }
  ]
});
formatter.background({
  "line": 30,
  "name": "opening url",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 32,
  "name": "open url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.open_url()"
});
formatter.result({
  "duration": 12064305354,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 34,
      "value": "# @regression"
    }
  ],
  "line": 35,
  "name": "Verify that user is able to login successfully with valid username password",
  "description": "",
  "id": "login-functionality-features;verify-that-user-is-able-to-login-successfully-with-valid-username-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#Given open url"
    },
    {
      "line": 37,
      "value": "# When user enters valid username"
    },
    {
      "line": 38,
      "value": "# And user enters valid password"
    }
  ],
  "line": 39,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user is logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "duration": 64612717,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 11354073,
  "error_message": "java.lang.NullPointerException\r\n\tat seleniumUtilities.SeleniumMethods.takeScreenshot(SeleniumMethods.java:375)\r\n\tat core.Verification.assertTrue(Verification.java:15)\r\n\tat stepDefinition.Login.user_is_logged_in_successfully(Login.java:54)\r\n\tat ✽.Then user is logged in successfully(LoginTests.feature:40)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 30,
  "name": "opening url",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 32,
  "name": "open url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.open_url()"
});
formatter.result({
  "duration": 11957143629,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 42,
      "value": "#@login"
    }
  ],
  "line": 43,
  "name": "Verify that user is able to login successfully with valid username password",
  "description": "",
  "id": "login-functionality-features;verify-that-user-is-able-to-login-successfully-with-valid-username-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 44,
      "value": "#Given open url"
    }
  ],
  "line": 45,
  "name": "user enters valid username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user enters valid password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user is logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 28
    }
  ],
  "location": "Login.user_enters_valid_username(String)"
});
formatter.result({
  "duration": 105557386,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 28
    }
  ],
  "location": "Login.user_enters_valid_password(String)"
});
formatter.result({
  "duration": 99756378,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "duration": 4808943243,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 9474241,
  "error_message": "java.lang.NullPointerException\r\n\tat seleniumUtilities.SeleniumMethods.takeScreenshot(SeleniumMethods.java:375)\r\n\tat core.Verification.assertTrue(Verification.java:15)\r\n\tat stepDefinition.Login.user_is_logged_in_successfully(Login.java:54)\r\n\tat ✽.Then user is logged in successfully(LoginTests.feature:48)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 30,
  "name": "opening url",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 32,
  "name": "open url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.open_url()"
});
formatter.result({
  "duration": 12104946981,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Verify that user is able to login successfully with valid username password",
  "description": "",
  "id": "login-functionality-features;verify-that-user-is-able-to-login-successfully-with-valid-username-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@login"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 52,
      "value": "#Given open url"
    }
  ],
  "line": 53,
  "name": "user enters valid username",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 54
    },
    {
      "cells": [
        "Admin"
      ],
      "line": 55
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "user enters valid password",
  "rows": [
    {
      "cells": [
        "password"
      ],
      "line": 57
    },
    {
      "cells": [
        "admin123"
      ],
      "line": 58
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user is logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_enters_valid_username(DataTable)"
});
formatter.result({
  "duration": 92477974,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_valid_password(DataTable)"
});
formatter.result({
  "duration": 104221517,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "duration": 3889766803,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 16497140,
  "error_message": "java.lang.NullPointerException\r\n\tat seleniumUtilities.SeleniumMethods.takeScreenshot(SeleniumMethods.java:375)\r\n\tat core.Verification.assertTrue(Verification.java:15)\r\n\tat stepDefinition.Login.user_is_logged_in_successfully(Login.java:54)\r\n\tat ✽.Then user is logged in successfully(LoginTests.feature:60)\r\n",
  "status": "failed"
});
});
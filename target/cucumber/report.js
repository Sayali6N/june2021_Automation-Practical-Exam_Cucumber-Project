$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BothColorSwitchTest.feature");
formatter.feature({
  "line": 2,
  "name": "Set SkyBlue and White Background Button Functionality Validation Of Techfios WebPage",
  "description": "",
  "id": "set-skyblue-and-white-background-button-functionality-validation-of-techfios-webpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SwitchColorTest"
    }
  ]
});
formatter.before({
  "duration": 2639818200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to change background color to Blue",
  "description": "",
  "id": "set-skyblue-and-white-background-button-functionality-validation-of-techfios-webpage;user-should-be-able-to-change-background-color-to-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button and Set White Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on the Set SkyBlue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on the Set White Background button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "SwitchBackgroundColor_StepDefination.set_SkyBlue_Background_button_and_Set_White_Background_button_exists()"
});
formatter.result({
  "duration": 2980448800,
  "status": "passed"
});
formatter.match({
  "location": "SwitchBackgroundColor_StepDefination.user_click_on_the_Set_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 2109681600,
  "status": "passed"
});
formatter.match({
  "location": "SwitchBackgroundColor_StepDefination.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 180009300,
  "status": "passed"
});
formatter.match({
  "location": "SwitchBackgroundColor_StepDefination.user_click_on_the_Set_White_Background_button()"
});
formatter.result({
  "duration": 2064177900,
  "status": "passed"
});
formatter.match({
  "location": "SwitchBackgroundColor_StepDefination.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 164890500,
  "status": "passed"
});
formatter.after({
  "duration": 759198500,
  "status": "passed"
});
});
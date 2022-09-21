$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mediaMonk.feature");
formatter.feature({
  "line": 2,
  "name": "MediaMock automation test cases for hotel booking component",
  "description": "",
  "id": "mediamock-automation-test-cases-for-hotel-booking-component",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "mediamock-automation-test-cases-for-hotel-booking-component;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@MediaMock"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch to hotel site \"Frontend\" env",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login to site",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify element text \"Welcome Back\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Frontend",
      "offset": 24
    }
  ],
  "location": "MediaMonkTest.iLoginToHotelSiteEnv(String)"
});
formatter.result({
  "duration": 24849935222,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: -0.000\n  (Session info: chrome\u003d105.0.5195.125)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027C02W81YPG8WL\u0027, ip: \u00272405:201:3007:a04c:e4a1:536f:bfe7:3e9e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.5.1\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d105.0.5195.52 (412c95e518836d8a7d97250d62b29c2ae6a26a85-refs/branch-heads/5195@{#853}), userDataDir\u003d/var/folders/ws/6qq5gj5x18x9xpny11hpp_wm0000gq/T/.com.google.Chrome.b5WWPP}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dMAC, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:61183}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, browserVersion\u003d105.0.5195.125, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 47a8453fd3a7965939b7914689401d69\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:370)\n\tat base.UIBase.browserInitialization(UIBase.java:35)\n\tat steps.MediaMonkTest.iLoginToHotelSiteEnv(MediaMonkTest.java:15)\n\tat ✽.Given I launch to hotel site \"Frontend\" env(mediaMonk.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "MediaMonkTest.iLoginToSite()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Back",
      "offset": 21
    }
  ],
  "location": "MediaMonkTest.verifyElementText(String)"
});
formatter.result({
  "status": "skipped"
});

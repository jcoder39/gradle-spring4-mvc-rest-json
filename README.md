Gradle - Spring 4 MVC - REST - JSON - IDEA - WAR
===============================
Sketeton web application using the Gradle build tool, Spring MVC, REST, JSON. Also IDEA and WAR plugins included.

## Requirements
* Gradle
* Spring 4.3.1.RELEASE

## To Run this project
```shell
$ git clone https://github.com/jcoder39/gradle-spring4-mvc-rest-json.git
$ gradle jettyRun
```

## Use sample
For test you can use some rest client like as ```https://addons.mozilla.org/ru/firefox/addon/restclient/``` for firefox.<br>
set method: GET<br>
set URL ```http://localhost:8080/rest/example/hello/slavik```<br>
<br>
for POST request set HTTP header: ```Content-Type: application/json```<br>
set method: POST<br>
set URL ```http://localhost:8080/rest/example/post```<br>
body: ```{"id": "abvc"}```

## License

[The MIT License (MIT)](LICENSE.md)
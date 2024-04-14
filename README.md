# ScreenplayBase

This repository contains all the necessary information for setting up a test automation project using the Screenplay design pattern for web applications. Additionally, it includes a utility called Kill Browser, which allows for the graceful closure of the browser instances from the root to prevent excessive CPU usage on the computer.

## Contact Information

- **Author:** Sebastián Zapata Castaño
- **Email:** zapatasebastian001@gmail.com
- **Phone:** +57 3505082088

## Dependencies

- [junit](https://mvnrepository.com/artifact/junit/junit) - Version 4.13.2
- [selenium](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) - Version 4.16.1
- [screenplay](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay) - Version 4.1.0
- [cucumber](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber) - Version 4.1.0
- [gradle](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-gradle-plugi) - Version 2.4.34
- [webdriver](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay-webdriver) - Version 4.1.0

Please make sure to install the above dependencies with the specified versions before setting up the project.

## Introduction

The Screenplay design pattern is a powerful approach to writing automated tests, particularly for web applications. It focuses on the interactions between different actors (such as users, systems, or components) and provides a clear separation between the what (actions) and the how (implementations). This promotes better readability, maintainability, and scalability of the test codebase.

## Kill Browser Utility

The Kill Browser utility is designed to gracefully close browser instances from the root, effectively terminating them to prevent excessive CPU consumption on the testing machine. This is particularly useful in scenarios where multiple browser instances are spawned during test execution, and closing them manually may not be feasible or efficient.

## Setup Instructions

1. Clone this repository to your local machine.
2. Install the required dependencies listed above using the provided links and versions.
3. Follow the guidelines and best practices outlined in the documentation to set up your test automation project.
4. Utilize the Kill Browser utility as needed to manage browser instances efficiently during test execution.

## Contribution

Contributions to this repository are welcome. If you encounter any issues, have suggestions, or would like to contribute enhancements, please feel free to submit a pull request or open an issue.

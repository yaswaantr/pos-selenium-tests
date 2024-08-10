# Project Name

This project is designed to build a Docker image for running Selenium tests.

## Prerequisites

- Docker installed on your machine
- update application url in this file: src/main/resources/config.properties
- update Grid url in this file: src/main/java/com/framework/selenium/api/base/DriverInstance.java

## Steps to Build and Run Tests

### 1. Build Docker Image

To build the Docker image, run the following command in your terminal:

```sh
docker build -t pos-selenium-test:latest -f posdockerfile .
```

### 2. Run Tests

To run the Selenium tests using the Docker image, use the following command:

```sh
docker run -d pos-selenium-test:latest
```

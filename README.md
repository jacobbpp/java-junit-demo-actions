# Java JUnit Demo with GitHub Actions

This project demonstrates how to run a simple Java application with JUnit tests and automate the build and test process using GitHub Actions.

---

## Project Structure

```
java-junit-demo-actions/
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java
```

---

## How It Works

- A simple Java class with a method:
    ```java
    public static int add(int a, int b) {
        return a + b;
    }
    ```
- A JUnit test verifies the method:
    ```java
    assertEquals(5, App.add(2, 3));
    ```

- The GitHub Actions workflow:
    - Checks out the repository
    - Sets up Java 17
    - Runs Maven to compile and test the code

---

## Running Tests Locally

Run the following command in the project root:

```bash
mvn clean test
```

If you haven’t got Maven installed, head here: [https://maven.apache.org/install.html](https://maven.apache.org/install.html)

---

## GitHub Actions Workflow

The workflow is defined in:

```
.github/workflows/maven.yml
```

It runs on every push or pull request to the `main` branch and executes:

```bash
mvn clean install
```

Sample output in the Actions logs:

```
Running com.example.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

## Live Build Status

![Build Status](https://github.com/jacobbpp/java-junit-demo-actions/actions/workflows/maven.yml/badge.svg)

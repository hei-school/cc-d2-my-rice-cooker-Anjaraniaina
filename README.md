# Rice Cooker Java

## Description
This is the implementation of the Rice Cooker project in Java.
### Features:
The service for unchecked item are not implemented yet.
1. [x] Plug in
2. [x] Pour water
3. [x] Put ingredient
4. [x] Set time
5. [x] Start
6. [x] Unplug
### Bug:
Unresolved bug till now:
* timer don't sync

## Installation
If you already have a java environment set-up, skip to the **How To use**.
### Requirements
* [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21): follow the link to download and install the JDK for your operating system.

## Standards
The full Java code style is [here](https://google.github.io/styleguide/javaguide.html)
Code Style used are in sum:
* Pascal case naming convention for classes.
* Camel case naming convention for methodes and fiels.
* Each section of a source file structure are separated by a blank line.

## Checkstyle
### What ?
It's the most popular linter for java.  
### Download
To download checkstyle, follow this [link](https://github.com/checkstyle/checkstyle/releases/).
### Usage
Checkstyle take in the parameter a xml file describing the style like this [Google Java Style Guide](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml).
To check a java file and if checkstyle jar and the xml file is in the current directory, run this command:
```
java -jar checkstyle-10.12.6.jar -c google_checks.xml src/File.java
```

## How to use ?
If you don't have an IDE but have a java setup, from the root directory just run these commands:
```
javac -d . ./src/*.java 
java com.wallet.Main
```
# Quiz 2 

I used Java, junit5 and Maven to complete this project using TDD.

## Requirements 

- Java version 21+ 
- Maven version 3.9+ 

## What you can do with this project 

- Add numbers together. Subtract. Multiply. Divide and see if a number is even.
- Check if a given Month has 31 days. If null is passed an exception will be thrown.

## Details about project 

- When dividing two numbers in the Calculator class we use javas divide method which gives us the answer of 3 if we did 13 divided by 4.
- You will receive an ArithmeticException if you try to divide a number by 0. This is default behavior when using Java. 
- Month is an Enum that consists of all 12 months.
- Months that return true for has31Days. January, March, May, July, August, October and December.
- Months that return false. April, June, September, November and February. 
- Why is February false? Well it only has 28 or 29 days depending on if its a leap year or not. So it will never have 31 days. 

Run the command below in your terminal to test the project.

``` 
mvn test 
``` 

This will generate some files inside of the target folder which will be ignored by git.

When I completed each task I would first write a test and make sure that it failed. Once my test failed I would create code that allowed it to pass. I made sure to commit each change I made throughout the project.

I used the src/main/java directory that Maven created for me. There are many different tests in this project some are from the Calculator and others from DateChecker. I used Junit 5 to help with my tests as well.
package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
       // declare variables here
      // then code solution
     // then use System.out.println() to display results// ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        int bobSalary;
        bobSalary = 1000;
        int garySalary;
        garySalary = 2000;
        int highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highestSalary is " + highestSalary);

        // Declaring the variables
        int carPrice = 17000;
        int truckPrice = 50000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowestSalary is " + lowestPrice);

        //Calculating The Area of circle
         double pi = 3.14;
         double radius = 7.25;
         double area = pi * (radius * radius);
        System.out.println("The area is " + area);

        // finding the square root
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root is " + squareRoot);

        //finding The distance
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        int xDifference = x1 - x2;
        int yDifference = y1 - y2;
        Math.pow(xDifference, 2);
        Math.pow(yDifference, 2);
        double sumOfSquare = Math.pow(xDifference, 2) + Math.pow(yDifference, 2);
        double distance = Math.sqrt(sumOfSquare);
        System.out.println("The distance is " + distance);

        //Finding the absolute value
        double value = -3.8;
        double valueAfter = Math.abs(value);
        System.out.println("The value is " + valueAfter);

        // Displaying  random number
        double randomNumber = Math.random();
        System.out.println("The random number is " + randomNumber);

        //Calculating How many minutes are in 24 days
        int day = 24;
        int minutesPerDay = 1440;
        int minutes;
        minutes = day * minutesPerDay;
        System.out.println("There are " + minutes + " minutes in 24 days");





















    }
}

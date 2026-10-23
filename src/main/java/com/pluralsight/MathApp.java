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














    }
}

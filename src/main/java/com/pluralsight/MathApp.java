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
        int lowestSalary = Math.min(carPrice, truckPrice);
        System.out.println("The lowestSalary is " + lowestSalary);






    }
}

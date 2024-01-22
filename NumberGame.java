package com.tnsif;
import java.util.Scanner;

public class NumberGame  {
    private int number1;
    private int number2;
    private int number3;

    // Constructor
    public NumberGame(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    // Method to find the smallest number
    public void findSmallestNumber() {
        int smallest = (number1 <= number2) ? (number1 <= number3 ? number1 : number3) : (number2 <= number3 ? number2 : number3);

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallest);
        }
    }


public class javaQue2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();

        // Create NumberGame object
        NumberGame numberGame = new NumberGame(num1, num2, num3);

        // Find and print the smallest number
        numberGame.findSmallestNumber();

        // Close the scanner (optional, as the program is simple)
        scanner.close();
    }
}}
	



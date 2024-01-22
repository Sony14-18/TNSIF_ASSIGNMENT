package com.tnsif;
import java.util.Scanner;

public class NumberSwapper {

    private int firstNumber;
    private int secondNumber;

    // Constructor
    public NumberSwapper(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // Method to swap numbers using bitwise XOR
    public void swapNumbers() {
        System.out.println("Before swapping: First Number = " + firstNumber + ", Second Number = " + secondNumber);

        // Using bitwise XOR to swap numbers
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        System.out.println("After swapping: First Number = " + firstNumber + ", Second Number = " + secondNumber);
    }


public class JavaQue3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        // Create NumberSwapper object
        NumberSwapper numberSwapper = new NumberSwapper(num1, num2);

        // Swap and print the numbers
        numberSwapper.swapNumbers();

        // Close the scanner (optional, as the program is simple)
        scanner.close();
    }
}
}




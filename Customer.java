package com.tnsif;

import java.util.*;

class Customer {
    private String name;
    private String source;
    private String destination;

    // Constructor
    public Customer(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}

class JavaQue1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get customer information
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        // Create Customer object
        Customer customer = new Customer(name, source, destination);

        // Print the message
        printMessage(customer);

        // Close the scanner (optional, as the program is simple)
        scanner.close();
    }

    // Method to print the message
    private static void printMessage(Customer customer) {
        System.out.println("Dear " + customer.getName() + ",");
        System.out.println("Thank you for choosing Sky Airlines for your travel from " +
                customer.getSource() + " to " + customer.getDestination() + ".");
        System.out.println("We wish you a pleasant journey!");
    }
}



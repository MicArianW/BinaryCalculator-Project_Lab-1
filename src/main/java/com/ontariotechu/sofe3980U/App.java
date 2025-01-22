package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Main program: The entry point of the program. The local time will be printed first,
     * Then it will interactively take two binary numbers from the user,
     * perform addition, OR, AND, and multiplication operations, and print the results.
     *
     * @param args: not used
     */
    public static void main(String[] args) 
    {
        // Print current local time
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get the first binary number from the user
        System.out.print("Enter the first binary number: ");
        String binaryInput1 = scanner.nextLine();
        Binary binary1 = new Binary(binaryInput1);
        System.out.println("First binary number is: " + binary1.getValue());
        
        // Get the second binary number from the user
        System.out.print("Enter the second binary number: ");
        String binaryInput2 = scanner.nextLine();
        Binary binary2 = new Binary(binaryInput2);
        System.out.println("Second binary number is: " + binary2.getValue());
        
        // Perform addition
        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Total after addition is: " + sum.getValue());
        
        // Perform OR operation
        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("The result of the OR operation is: " + orResult.getValue());
        
        // Perform AND operation
        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("The result of the AND operation is: " + andResult.getValue());
        
        // Perform multiplication
        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("The result of the multiplication is: " + multiplyResult.getValue());
        
        // Close the scanner
        scanner.close();
    }
}

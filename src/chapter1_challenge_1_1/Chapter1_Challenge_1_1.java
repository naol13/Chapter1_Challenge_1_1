/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_challenge_1_1;
import java.util.Scanner;


public class Chapter1_Challenge_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a positive integer (at least 4 digits): ");
        int number = scanner.nextInt();
        
        // Ensure positive number (basic robustness)
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        
        // Calculate number of digits using log10
        int numDigits = (int) Math.log10(number) + 1;
        
        // For this challenge to work, we need at least 4 digits
        // Since we can't use if statements in the decoding logic per challenge rules,
        // we assume valid input (>=4 digits) as per problem context.
        // But we added a minimal check above for positivity.
        
        // Extract last digit
        int lastDigit = number % 10;
        
        // Extract first digit
        int divisorForFirst = (int) Math.pow(10, numDigits - 1);
        int firstDigit = number / divisorForFirst;
        
        // Compute product of first and last
        int product = firstDigit * lastDigit;
        
        // Extract second digit
        int remainderAfterFirst = number % divisorForFirst;
        int divisorForSecond = (int) Math.pow(10, numDigits - 2);
        int secondDigit = remainderAfterFirst / divisorForSecond;
        
        // Extract second-last digit
        int secondLastDigit = (number / 10) % 10;
        
        // Compute sum of second and second-last
        int sum = secondDigit + secondLastDigit;
        
        // Output the decrypted code by concatenating product and sum as strings
        System.out.println("The decrypted code is: " + product + sum);
        
        scanner.close();
    }
}
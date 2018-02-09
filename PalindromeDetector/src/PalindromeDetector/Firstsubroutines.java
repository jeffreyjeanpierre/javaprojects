/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromeDetector;

import java.util.Scanner;

/**
 *
 * @author Jeffrey
 */
public class Firstsubroutines {
    // command line string arguments will be returned without non chars
    private static String getAndFormatInputString(String[] args){
        String stringToReturn = "";
        String currentChar = "";
        
        // do the transformation from array of strings to a string
        int i;
        for (i = 0; i < args.length; i++ )
        {
            currentChar = args[i]; // this way doesn't keep checking args
            stringToReturn = stringToReturn.concat(currentChar);
        }
        
        TextIO.putln(currentChar);
        // returning in lowercase and omitting non alphanumerics using regex
        stringToReturn = stringToReturn.replaceAll("[a-zA-Z]+\\\\.?", "");
        return stringToReturn.toLowerCase();
    }
    
    // will take a string and return a reverse of it
    private static String reverseString(String str){
        String reverse;
        int i;
        reverse = "";

        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare types
        String reverseStr, result, originalStr = "";
        boolean isPalindrome;
        Scanner reader = new Scanner(System.in);
        // transform strings and create result
        //originalStr = getAndFormatInputString(args);
        TextIO.putln("Enter a palindrome: ");
        String[] textInput = reader.next().split(",");
        originalStr = getAndFormatInputString(textInput);
        reverseStr = reverseString(originalStr);
        isPalindrome = (reverseStr.equals(originalStr));
        if (isPalindrome)
        {   
            result = (originalStr + " is a palindrome.");
        }
        else
        {
            result = ("A palindrome was not found in: " + originalStr);
        }
        
        // print results
        TextIO.putln("Original string: " + originalStr);
        TextIO.putln("Reversed string: " + reverseStr);
        TextIO.putln(result);
        
    }
    
}

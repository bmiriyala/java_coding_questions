package com.babu;

public class PalindromeTest {

	public static void main(String[] args) {
		// An String is said to be palindrome if it is equal to itself after reversing.
		
		// Input string
        String str = "geeg";
        
		/*
		 * String reverse = new StringBuilder(str).reverse().toString();
		 * if(str.equalsIgnoreCase(reverse)) { // It is a palindrome
		 * System.out.print("Yes - Palendrome");} else {
		 * 
		 * // Not a palindrome System.out.print("No - Not a Palindrome"); }
		 */
 
        //Convert the string to lowercase
        str = str.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(str))
 
            // It is a palindrome
            System.out.print("Yes");
        else
 
            // Not a palindrome
            System.out.print("No");

	}
	
	static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }

}

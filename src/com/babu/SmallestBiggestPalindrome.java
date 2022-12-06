package com.babu;

public class SmallestBiggestPalindrome {

	//isPalindrome() checks whether a string is palindrome or not  
    public static boolean isPalindrome(String a){  
        boolean flag = true;  
        //Iterate the string forward and backward and compare one character at a time   
        //till middle of the string is reached  
        for(int i = 0; i < a.length()/2; i++){  
            if(a.charAt(i) != a.charAt(a.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        return flag;  
    }  
      
    public static void main(String[] args){  
        String string = "Wow you own kayak";  
        String word = "", smallPalin = "", bigPalin="";  
        String[] words = new String[100];  
        int temp = 0, count = 0;  
          
        //Converts the given string into lowercase  
        string = string.toLowerCase();  
          
        //Add extra space after string to get the last word in the given string  
        string = string + " ";  
          
        for(int i = 0; i < string.length(); i++){  
            //Split the string into words  
            if(string.charAt(i) != ' '){  
                word = word + string.charAt(i);  
            }  
            else{  
                //Add word to array words  
                words[temp] = word;  
                //Increment temp  
                temp++;  
                //Make word an empty string  
                word = "";  
            }  
        }  
          
        //Determine the smallest and biggest palindromes in a given string  
        for(int i = 0; i< temp; i++){  
            if(isPalindrome(words[i])){  
                  
                count++;  
                //When first palindromic word is found  
                if(count == 1)  
                    //Initialize smallPalin and bigPalin with first palindromic word  
                    smallPalin = bigPalin = words[i];  
                  
                //Compare smallPalin and bigPalin with each palindromic words  
                else{  
                    //If length of smallPalin is greater than next palindromic word   
                    //Store that word in smallPalin  
                    if(smallPalin.length() > words[i].length())  
                        smallPalin = words[i];  
                          
                    //If length of bigPalin is less than next palindromic word   
                    //Store that word in bigPalin  
                    if(bigPalin.length() < words[i].length())  
                        bigPalin = words[i];  
                }  
            }  
        }  
          
        if(count == 0)  
            System.out.println("No palindrome is present in the given string");  
        else{  
            System.out.println("Smallest palindromic word: " + smallPalin);  
            System.out.println("Biggest palindromic word: " + bigPalin);  
        }  
    } 
    
    
    
    
    	// other way
    
    
    /*
     * // Function to print a subString str[low..high]
static void printSubStr(String str, int low, int high)
{
    for (int i = low; i <= high; ++i)
        System.out.print(str.charAt(i));
}
 
// This function prints the
// longest palindrome subString
// It also returns the length
// of the longest palindrome
static int longestPalSubstr(String str)
{
    // get length of input String
    int n = str.length();
 
    // All subStrings of length 1
    // are palindromes
    int maxLength = 1, start = 0;
 
    // Nested loop to mark start and end index
    for (int i = 0; i < str.length(); i++) {
        for (int j = i; j < str.length(); j++) {
            int flag = 1;
 
            // Check palindrome
            for (int k = 0; k < (j - i + 1) / 2; k++)
                if (str.charAt(i + k) != str.charAt(j - k))
                    flag = 0;
 
            // Palindrome
            if (flag!=0 && (j - i + 1) > maxLength) {
                start = i;
                maxLength = j - i + 1;
            }
        }
    }
 
    System.out.print("Longest palindrome subString is: ");
    printSubStr(str, start, start + maxLength - 1);
 
    // return length of LPS
    return maxLength;
}
 
// Driver Code
public static void main(String[] args)
{
    String str = "forgeeksskeegfor";
    System.out.print("\nLength is: "
         + longestPalSubstr(str));
}
     */

}

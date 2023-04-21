package com.babu.common.questions;

public class FIndLengthOfCommonSubStringInGivenStrings {
    public static void main(String[] args) {
        String str1="adac";
        String str2="adadac";
        FIndLengthOfCommonSubStringInGivenStrings lcsMain = new FIndLengthOfCommonSubStringInGivenStrings();
        System.out.println("Longest common subString is: " +lcsMain.getLongestCommonSubstring(str1, str2));
        System.out.println("Longest common subString length is: " +lcsMain.getLengthOfLongestCommonSubstring(str1, str2));
    }
    public int getLengthOfLongestCommonSubstring(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int max = 0;
        int[][] array = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    // If first row or column
                    if(i==0 || j==0){
                        array[i][j]=1;
                    }else{
                    // Add 1 to the diagonal value
                        array[i][j] = array[i-1][j-1]+1;
                    }
                    if(max < array[i][j])
                    {
                        max = array[i][j];
                    }
                }
            }
        }
        return max;
    }

    public String getLongestCommonSubstring(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int max = 0;
        int[][] array = new int[m][n];
        int endIndex=-1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    // If first row or column
                    if(i==0 || j==0){
                        array[i][j]=1;
                    }else{
                        // Add 1 to the diagonal value
                        array[i][j] = array[i-1][j-1]+1;
                    }
                    if(max < array[i][j])
                    {
                        max = array[i][j];
                        endIndex=i;
                    }
                }
            }
        }
        // We want String upto endIndex, we are using endIndex+1 in substring.
        return str1.substring(endIndex-max+1,endIndex+1);
    }
}

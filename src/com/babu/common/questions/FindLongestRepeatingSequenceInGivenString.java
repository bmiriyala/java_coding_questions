package com.babu.common.questions;

public class FindLongestRepeatingSequenceInGivenString {

	public static void main(String[] args) {
		String actual = "bcdabcfrbcbcddbcdd";
			
		String lrs="";
        int n = actual.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //Checks for the largest common factors in every substring
                String x = lcp(actual.substring(i,n),actual.substring(j,n));
                //If the current prefix is greater than previous one 
                //then it takes the current one as longest repeating sequence
                if(x.length() > lrs.length()) lrs=x;  
            }
        }
        System.out.println("Longest repeating sequence: "+lrs);

	}
	//Checks for the largest common prefix
    public static String lcp(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

}

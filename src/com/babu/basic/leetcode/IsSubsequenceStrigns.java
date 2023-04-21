package com.babu.basic.leetcode;

import java.util.Objects;

public class IsSubsequenceStrigns {
    public static boolean isSubsequence(String s, String t) {
        if(Objects.equals(s, "")) return true;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int j = 0;
        for(int i = 0; i < t.length() && j < s.length(); i++){
            if(sArray[j] == tArray[i]){
                j++;
            }
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        //String s = "abc", t = "ahbgdc";
        //String s = "axc", t = "ahbgdc";
        String s = "aaaaaa", t = "ahbgdc";
        //String s = "ab", t = "baab";
        //String s = "b", t = "abc";
        boolean isSubsequence = isSubsequence(s, t);
        System.out.println(isSubsequence);
    }
}

package com.babu.basic.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringsTest {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(int i = 0; i< s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if(map.containsKey(ss)){
                if(map.get(ss) != tt){
                    return false;
                }
            }
            else if(map.containsValue(tt)){
                return false;
            }

            map.put(ss, tt);
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStringsTest isomorphicStringsTest = new IsomorphicStringsTest();
        String s = "egg"; String t = "add";
        //String s = "foo"; String t = "bar";
        //String s = "paper"; String t = "title";
        boolean isIsomorphicStrings   = isomorphicStringsTest.isIsomorphic(s, t);
        System.out.println(s + " and " + t + " are IsomorphicStrings :: " + isIsomorphicStrings);
    }

}

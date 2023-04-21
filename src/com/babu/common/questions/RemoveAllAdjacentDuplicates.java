package com.babu.common.questions;

public class RemoveAllAdjacentDuplicates {
    String removeDuplicates(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] chars = s.toCharArray();
        int i, k = 0;
        for (i = 1; i < chars.length; i++)
        {
            if (chars[i - 1] != chars[i]) {
                chars[k++] = chars[i - 1];
            }
            else {
                // remove adjacent duplicates
                while (i < chars.length && chars[i - 1] == chars[i]) {
                    i++;
                }
            }
        }
        // add the last character to the result
        chars[k++] = chars[i - 1];

        // construct a string with the first `k` chars
        String str = new String(chars).substring(0, k);

        // start again if any duplicate is removed
        if (k != chars.length) {
            return removeDuplicates(str);
        }

        return str;
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicates removeAllAdjacentDuplicates = new RemoveAllAdjacentDuplicates();
        String strAfterDuplicates = removeAllAdjacentDuplicates.removeDuplicates("abccbdeef");
        System.out.println(strAfterDuplicates);
    }
}

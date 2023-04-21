package com.babu.common.questions;

public class ReverseStringWithSpecialChars {

    public static void main(String[] args) {
        String input = "abcd@gh"; // output: "hgdc@ba"
        String str = reverseStringWithSplChars(input);
        System.out.println(str);
    }

    private static String reverseStringWithSplChars(String input) {
        char[] array = input.toCharArray();
        int i = 0;
        int j = input.length() - 1;
        while (i < j){
            if (!Character.isAlphabetic(array[i])){
                i++;
            } else if (!Character.isAlphabetic(array[j])) {
                j --;
            } else {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return new String(array);
    }
}

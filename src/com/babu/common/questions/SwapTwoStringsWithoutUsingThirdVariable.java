package com.babu.common.questions;

public class SwapTwoStringsWithoutUsingThirdVariable {

    public void swap(){
        String str1="abc";
        String str2="efg";

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("str1: " + str1 +" "+ "str2: " + str2);
    }

    public static void main(String[] args) {
        SwapTwoStringsWithoutUsingThirdVariable stwutv = new SwapTwoStringsWithoutUsingThirdVariable();
        stwutv.swap();
    }
}

package com.babu.common.questions;

public class ValidIPvFourStringTest {
    public boolean isValid(String s) {
        String[] array = s.split("[.]", 0);

        if(s.startsWith(".") || s.endsWith(".") || array.length != 4){
            return false;
        }

        for(int i = 0; i < array.length; i++){
            array[i] = array[i].replaceAll("[^\\d]", "");
            if(array[i].length() == 0
                    || array[i].length() > 3
                    || ( array[i].startsWith("0") && array[i].length() > 1 )
                    || Integer.parseInt(array[i]) < 0
                    || Integer.parseInt(array[i]) > 255
            ){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        ValidIPvFourStringTest validIPvFourStringTest = new ValidIPvFourStringTest();
       //boolean isValidIPvFourString =  validIPvFourStringTest.isValid("172.16.254.1");
        boolean isValidIPvFourString =  validIPvFourStringTest.isValid("172.16.254.1");
       System.out.println(isValidIPvFourString);
    }
}

//https://practice.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1?page=1&category[]=Strings&category[]=Java&sortBy=submissions
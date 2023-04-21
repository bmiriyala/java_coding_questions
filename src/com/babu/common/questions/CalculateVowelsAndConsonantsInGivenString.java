package com.babu.common.questions;

public class CalculateVowelsAndConsonantsInGivenString {
    public static void countVowels(String str){
        long count = str.chars()
                .filter(ch->(ch == 'a') || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u').count();
        System.out.println("Vowels count is: "+ count);
    }
    public static void countConsonants(String str){
        long count = str.chars()
                .filter(ch->(ch != 'a' && ch != 'e' && ch != 'i' && ch !='o'
                        && ch != 'u')).count();
        System.out.println("Consonant count is: "+ count);
    }

    public static void main(String[] args) {
        countVowels("abcdeabcde");
        countConsonants("abcdeabcde");
    }
}

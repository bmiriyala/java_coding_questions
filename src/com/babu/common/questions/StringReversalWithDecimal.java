package com.babu.common.questions;

public class StringReversalWithDecimal {
    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        String[] array = input.split("[.]", 0);
        StringBuilder builder = new StringBuilder();

        for(int i= array.length - 1; i >= 0; i--){
            builder.append(array[i]);
            builder.append(".");
        }
        System.out.println(builder.toString().substring(0, builder.length()-1));
    }
}

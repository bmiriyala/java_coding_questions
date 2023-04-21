package com.babu.latestfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PatternMatchingWithInstanceOf {

    public static void main(String[] args) {
        String str = "PatternMatching is new Feature of Java 16";

        if(str instanceof String){
            String derivedStr = (String) str;
            //perform some action
            System.out.println(derivedStr);
        }

       Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");

        if (cat instanceof Cat s){
            System.out.println(s.name());
        }

    }
}

interface Animal{}
record Dog(String nam) implements Animal{}
record Cat(String name) implements Animal{}

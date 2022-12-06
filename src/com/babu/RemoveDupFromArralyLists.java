package com.babu;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupFromArralyLists {

	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("Java", "Hibernate", "Spring", "Angular"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("Spring", "Core Java", "React Js", "Hibernate", "Microservices"));
         
        //remove all elements from second list
        //listTwo.removeAll(listOne);
         
        //System.out.println(listTwo);
        
      //remove all elements from second list
        listOne.removeAll(listTwo);
        System.out.println(listOne);

	}

}

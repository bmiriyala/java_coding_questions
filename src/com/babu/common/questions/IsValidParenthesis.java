package com.babu.common.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValidParenthesis {

	public static void main(String[] args) {
		//inputs are "{[]}", "{[}]", "[{}]", "[}]{"
		/*
		 * boolean isValidParenthesis = checkParentesis("{}[]");
		 * System.out.println("isValidParenthesis:  " + isValidParenthesis);
		 */
		
		boolean isValidParenthesis = isValid("{[]}");
		System.out.println("isValidParenthesis:  " + isValidParenthesis);


	}
	
	public static boolean checkParentesis(String str)
	{
	    if (str.isEmpty())
	        return true;

	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++)
	    {
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '[')
	        {
	            stack.push(current);
	        }


	        if (current == '}' || current == ')' || current == ']')
	        {
	            if (stack.isEmpty())
	                return false;

	            char last = stack.peek();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	                stack.pop();
	            else 
	                return false;
	        }

	    }

	    return stack.isEmpty();
	}
	
	public static boolean isValid(String s) {
	    Map<Character, Character> map = new HashMap<>();
	    map.put('(', ')');
	    map.put('[', ']');
	    map.put('{', '}');
	    Stack<Character> stack = new Stack<>();
	    for(char c : s.toCharArray()){
	        if(map.containsKey(c)){
	            stack.push(c);
	        } else if(!stack.empty() && map.get(stack.peek())==c){
	            stack.pop();
	        } else {
	            return false;
	        }
	    }
	    return stack.empty();
	}

}

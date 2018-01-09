package com.robert.OOPPractice;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        // TODO: We will use this for testing. If you'd like, you may call
    	// your other methods here to verify the output matches what you 
    	// expect, but we'll discuss JUnit Testing when we review.
    }
    
    //TODO: Given an array of integers (int[]), add all of the integers 
    // contained within, and return the sum.
    public static int sum(int[] array) {
    	int[] integers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    	int total = 0;
    	for (int i = 0; i < integers.length; i++) {
    		total = total + integers[i];
    	}
    	
    	System.out.print(total);
    	
    	return total;
    	
    	
    }
    
    // TODO: Given a string object, print the string to the standard output.
    public void printString(String string) {
    	String words = "A string of things that sings of rings.";
    	System.out.println(words);
    }
    
    // TODO: Given an array of Strings, and a String keyword, return the index
    // of the keyword in the Array, or -1 if the keyword does not appear in the 
    // array. You may assume the keyword will appear at least once.
    public int findStringIndex(String[] array, String keyword) {
    	// Use currentWordInArray.equals(keyword);
    	String[] sayIt = {"Something", "Goes", "Into", "These", "Spots"};
    	
    	
    }
}

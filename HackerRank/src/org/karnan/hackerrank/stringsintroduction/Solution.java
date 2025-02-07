package org.karnan.hackerrank.stringsintroduction;

//import java.io.*;
//import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Solution {

	public static void main(String[] args) {		
		
		ArrayList<String> output = new ArrayList();
		
		String A = "hello";
		String B = "java";
		output.add(A);		
		output.add(B);
		Solution sol = new Solution();
		sol.compute(output);	
		
	}

 //method to sum the lengths of A and B.
	public void compute(ArrayList<String> output){
	 int lengthA = output.get(0).length();
	 int lengthB = output.get(1).length();	 	
	 int totalLength = lengthA + lengthB;
	 String tLength = String.valueOf(totalLength);
	 output.add(tLength);	 
	 this.lexo(output);
	}
	
	//method to make lexographic comparison
	public void lexo(ArrayList<String> output) {
		int lexResult = output.get(0).compareToIgnoreCase(output.get(1));
		String result="";
		if(lexResult>0)
		{
		 result="Yes";		
	    }
		else if (lexResult<0 || lexResult==0 ) {	
			result="No";	
		}	
		/*
		 * else { result="No"; }
		 */
		
		output.add(result);
		this.output(output);		
	}
	
	//method to print out the result
	public void output(ArrayList<String> output) {
		
		//Capitalize the first letter of Strings A and B
		output.set(0, output.get(0).substring(0,1).toUpperCase() + output.get(0).substring(1) );
		output.set(1, output.get(1).substring(0,1).toUpperCase() + output.get(1).substring(1) );	
		
		ArrayList<String> printOut = new ArrayList();
		printOut.add(output.get(2));
		printOut.add(output.get(3));
		printOut.add(output.get(0) + " " + output.get(1));
		
		  for(String s: printOut)
		  { 
			  System.out.println(s); 
			  }		 							
	}		
}
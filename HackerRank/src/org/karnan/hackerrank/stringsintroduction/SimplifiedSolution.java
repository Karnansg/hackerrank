package org.karnan.hackerrank.stringsintroduction;

import java.util.Scanner;
import java.util.ArrayList;

public class SimplifiedSolution {

	public static void main(String[] args) {		

		String A = "ma";
		String B = "mad";

		//individul string length
		int lengthA  = A.length();
		int lengthB  = B.length();

		//total string length
		int totalLength = lengthA + lengthB;
		String tLength = String.valueOf(totalLength);

		//lexographic comaparison
		int lexResult = A.compareTo(B);  
		String result="";
		if(lexResult>0)
		{
			result="Yes";		
		}
		else if (lexResult<0 || lexResult==0 ) {	
			result="No";
		}
		
		//capitalize the first letter of Strings A and B
		A= A.substring(0,1).toUpperCase() + A.substring(1);
		B= B.substring(0,1).toUpperCase() + B.substring(1);
		
		//print result
		System.out.println(totalLength);
		System.out.println(result);
		System.out.println(A + " " +  B);				
	}
}
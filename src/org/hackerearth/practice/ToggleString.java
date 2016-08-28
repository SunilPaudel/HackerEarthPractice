package org.hackerearth.practice;

/*
 * You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.

Constraints
1≤|S|≤100
where |S| denotes the length of string S. 
 */

import java.util.Scanner;

public class ToggleString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Get the input from the user
		int len;
		String newStr = "";
		
		do{
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the string of length 1 to 100: ");
			String inputStr = reader.next();
			//check the length of the string
			len = inputStr.length();
			if (len <= 100) {
				//write the logic to toggle the string and then exit
				for (int i = 0; i < len; i++) {
					char ch = inputStr.charAt(i);
					//System.out.print(inputStr.charAt(i));
					if (Character.isUpperCase(ch)) {
						newStr = newStr + Character.toLowerCase(ch);
					}
					else if (Character.isLowerCase(ch)) {
						newStr = newStr + Character.toUpperCase(ch);
					}
					else{
						newStr = newStr + inputStr.charAt(i);
					}
				}
				System.out.println("The output is: " + newStr);
				break;
			}
			System.out.println("Kindly enter the string of less than 100");
		}while(len > 100);
	}
}

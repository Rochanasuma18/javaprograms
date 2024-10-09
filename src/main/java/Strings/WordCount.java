package Strings;

import java.util.Scanner;

public class WordCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string:");
	String str= sc.nextLine();
	int spc=0;
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			spc++;
		}

	}
	int wd_cnt=spc+1;
	
	//creating an Array that matches to the count of word 
	String arr[] = new String[wd_cnt];
	int temp= arr.length-1;
	
	//loop the string in reverse direction
	String temp_string="";
	for(int i= str.length()-1; i>=0; i--) {
		if(str.charAt(i)!=' ') {
			temp_string = temp_string + str.charAt(i);
		}
		else {
			arr[temp]=temp_string;
			temp--;
			temp_string="";
		}
	}
	arr[temp]=temp_string;
	
	//printing the reverse string array
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
  }
}

